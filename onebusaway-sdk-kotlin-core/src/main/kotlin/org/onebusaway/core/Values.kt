package org.onebusaway.core

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside
import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.BeanProperty
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.node.JsonNodeType.ARRAY
import com.fasterxml.jackson.databind.node.JsonNodeType.BINARY
import com.fasterxml.jackson.databind.node.JsonNodeType.BOOLEAN
import com.fasterxml.jackson.databind.node.JsonNodeType.MISSING
import com.fasterxml.jackson.databind.node.JsonNodeType.NULL
import com.fasterxml.jackson.databind.node.JsonNodeType.NUMBER
import com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT
import com.fasterxml.jackson.databind.node.JsonNodeType.POJO
import com.fasterxml.jackson.databind.node.JsonNodeType.STRING
import com.fasterxml.jackson.databind.ser.std.NullSerializer
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.nio.charset.Charset
import java.util.Objects
import kotlin.reflect.KClass
import org.apache.hc.core5.http.ContentType
import org.onebusaway.errors.OnebusawaySdkInvalidDataException

@JsonDeserialize(using = JsonField.Deserializer::class)
sealed class JsonField<out T : Any> {

    fun isMissing(): Boolean = this is JsonMissing

    fun isNull(): Boolean = this is JsonNull

    fun asKnown(): T? =
        when (this) {
            is KnownValue -> value
            else -> null
        }

    /**
     * If the "known" value (i.e. matching the type that the SDK expects) is returned by the API
     * then this method will return `null`, otherwise a `JsonValue` is returned.
     */
    fun asUnknown(): JsonValue? =
        when (this) {
            is JsonValue -> this
            else -> null
        }

    fun asBoolean(): Boolean? =
        when (this) {
            is JsonBoolean -> value
            else -> null
        }

    fun asNumber(): Number? =
        when (this) {
            is JsonNumber -> value
            else -> null
        }

    fun asString(): String? =
        when (this) {
            is JsonString -> value
            else -> null
        }

    fun asStringOrThrow(): String =
        when (this) {
            is JsonString -> value
            else -> throw OnebusawaySdkInvalidDataException("Value is not a string")
        }

    fun asArray(): List<JsonValue>? =
        when (this) {
            is JsonArray -> values
            else -> null
        }

    fun asObject(): Map<String, JsonValue>? =
        when (this) {
            is JsonObject -> values
            else -> null
        }

    internal fun getRequired(name: String): T =
        when (this) {
            is KnownValue -> value
            is JsonMissing -> throw OnebusawaySdkInvalidDataException("'${name}' is not set")
            is JsonNull -> throw OnebusawaySdkInvalidDataException("'${name}' is null")
            else ->
                throw OnebusawaySdkInvalidDataException("'${name}' is invalid, received ${this}")
        }

    internal fun getNullable(name: String): T? =
        when (this) {
            is KnownValue -> value
            is JsonMissing -> null
            is JsonNull -> null
            else ->
                throw OnebusawaySdkInvalidDataException("'${name}' is invalid, received ${this}")
        }

    internal fun <R : Any> map(transform: (T) -> R): JsonField<R> =
        when (this) {
            is KnownValue -> KnownValue.of(transform(value))
            is JsonValue -> this
        }

    fun <R> accept(visitor: Visitor<T, R>): R =
        when (this) {
            is KnownValue -> visitor.visitKnown(value)
            is JsonValue -> accept(visitor as JsonValue.Visitor<R>)
        }

    interface Visitor<in T, out R> : JsonValue.Visitor<R> {
        fun visitKnown(value: T): R = visitDefault()
    }

    companion object {
        fun <T : Any> of(value: T): JsonField<T> = KnownValue.of(value)

        fun <T : Any> ofNullable(value: T?): JsonField<T> =
            when (value) {
                null -> JsonNull.of()
                else -> KnownValue.of(value)
            }
    }

    // This class is a Jackson filter that can be used to exclude missing properties from objects
    // This filter should not be used directly and should instead use the @ExcludeMissing annotation
    class IsMissing {
        override fun equals(other: Any?): Boolean = other is JsonMissing

        override fun hashCode(): Int = Objects.hash()
    }

    class Deserializer(private val type: JavaType? = null) :
        BaseDeserializer<JsonField<*>>(JsonField::class) {

        override fun createContextual(
            context: DeserializationContext,
            property: BeanProperty?,
        ): JsonDeserializer<JsonField<*>> {
            return Deserializer(context.contextualType?.containedType(0))
        }

        override fun ObjectCodec.deserialize(node: JsonNode): JsonField<*> {
            return type?.let { tryDeserialize<Any>(node, type) }?.let { of(it) }
                ?: JsonValue.fromJsonNode(node)
        }

        override fun getNullValue(context: DeserializationContext): JsonField<*> {
            return JsonNull.of()
        }
    }
}

@JsonDeserialize(using = JsonValue.Deserializer::class)
sealed class JsonValue : JsonField<Nothing>() {

    inline fun <reified R : Any> convert(): R? = convert(jacksonTypeRef())

    fun <R : Any> convert(type: TypeReference<R>): R? = JSON_MAPPER.convertValue(this, type)

    fun <R : Any> convert(type: KClass<R>): R? = JSON_MAPPER.convertValue(this, type.java)

    fun <R> accept(visitor: Visitor<R>): R =
        when (this) {
            is JsonMissing -> visitor.visitMissing()
            is JsonNull -> visitor.visitNull()
            is JsonBoolean -> visitor.visitBoolean(value)
            is JsonNumber -> visitor.visitNumber(value)
            is JsonString -> visitor.visitString(value)
            is JsonArray -> visitor.visitArray(values)
            is JsonObject -> visitor.visitObject(values)
        }

    interface Visitor<out R> {
        fun visitNull(): R = visitDefault()

        fun visitMissing(): R = visitDefault()

        fun visitBoolean(value: Boolean): R = visitDefault()

        fun visitNumber(value: Number): R = visitDefault()

        fun visitString(value: String): R = visitDefault()

        fun visitArray(values: List<JsonValue>): R = visitDefault()

        fun visitObject(values: Map<String, JsonValue>): R = visitDefault()

        fun visitDefault(): R {
            throw RuntimeException("Unexpected value")
        }
    }

    companion object {

        private val JSON_MAPPER = jsonMapper()

        fun from(value: Any?): JsonValue =
            when (value) {
                null -> JsonNull.of()
                is JsonValue -> value
                else -> JSON_MAPPER.convertValue(value, JsonValue::class.java)
            }

        fun fromJsonNode(node: JsonNode): JsonValue =
            when (node.nodeType) {
                MISSING -> JsonMissing.of()
                NULL -> JsonNull.of()
                BOOLEAN -> JsonBoolean.of(node.booleanValue())
                NUMBER -> JsonNumber.of(node.numberValue())
                STRING -> JsonString.of(node.textValue())
                ARRAY ->
                    JsonArray.of(node.elements().asSequence().map { fromJsonNode(it) }.toList())
                OBJECT ->
                    JsonObject.of(
                        node.fields().asSequence().map { it.key to fromJsonNode(it.value) }.toMap()
                    )
                BINARY,
                POJO,
                null -> throw IllegalStateException("Unexpected JsonNode type: ${node.nodeType}")
            }
    }

    class Deserializer : BaseDeserializer<JsonValue>(JsonValue::class) {
        override fun ObjectCodec.deserialize(node: JsonNode): JsonValue {
            return fromJsonNode(node)
        }

        override fun getNullValue(context: DeserializationContext?): JsonValue {
            return JsonNull.of()
        }
    }
}

class KnownValue<T : Any>
private constructor(
    @com.fasterxml.jackson.annotation.JsonValue @get:JvmName("value") val value: T
) : JsonField<T>() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KnownValue<*> && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {
        @JsonCreator fun <T : Any> of(value: T) = KnownValue(value)
    }
}

@JsonSerialize(using = JsonMissing.Serializer::class)
class JsonMissing : JsonValue() {

    override fun toString() = ""

    companion object {
        private val INSTANCE: JsonMissing = JsonMissing()

        fun of() = INSTANCE
    }

    class Serializer : BaseSerializer<JsonMissing>(JsonMissing::class) {
        override fun serialize(
            value: JsonMissing,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            throw RuntimeException("JsonMissing cannot be serialized")
        }
    }
}

@JsonSerialize(using = NullSerializer::class)
class JsonNull : JsonValue() {

    override fun toString() = "null"

    companion object {
        private val INSTANCE: JsonNull = JsonNull()

        @JsonCreator fun of() = INSTANCE
    }
}

class JsonBoolean
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue @get:JvmName("value") val value: Boolean
) : JsonValue() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonBoolean && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {
        @JsonCreator fun of(value: Boolean) = JsonBoolean(value)
    }
}

class JsonNumber
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue @get:JvmName("value") val value: Number
) : JsonValue() {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonNumber && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {
        @JsonCreator fun of(value: Number) = JsonNumber(value)
    }
}

class JsonString
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue @get:JvmName("value") val value: String
) : JsonValue() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonString && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value

    companion object {
        @JsonCreator fun of(value: String) = JsonString(value)
    }
}

class JsonArray
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue
    @get:JvmName("values")
    val values: List<JsonValue>
) : JsonValue() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonArray && values == other.values
    }

    override fun hashCode() = values.hashCode()

    override fun toString() = values.toString()

    companion object {
        @JsonCreator fun of(values: List<JsonValue>) = JsonArray(values.toImmutable())
    }
}

class JsonObject
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue
    @get:JvmName("values")
    val values: Map<String, JsonValue>
) : JsonValue() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonObject && values == other.values
    }

    override fun hashCode() = values.hashCode()

    override fun toString() = values.toString()

    companion object {
        @JsonCreator fun of(values: Map<String, JsonValue>) = JsonObject(values.toImmutable())
    }
}

@JacksonAnnotationsInside
@JsonInclude(
    JsonInclude.Include.CUSTOM,
    valueFilter = JsonField.IsMissing::class,
)
annotation class ExcludeMissing

@JacksonAnnotationsInside
@JsonAutoDetect(
    getterVisibility = Visibility.NONE,
    isGetterVisibility = Visibility.NONE,
    setterVisibility = Visibility.NONE,
    creatorVisibility = Visibility.NONE,
    fieldVisibility = Visibility.NONE
)
annotation class NoAutoDetect

class MultipartFormValue<T>
internal constructor(
    val name: String,
    val value: T,
    val contentType: ContentType,
    val filename: String? = null
) {

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    contentType,
                    filename,
                    when (value) {
                        is ByteArray -> value.contentHashCode()
                        is String -> value
                        is Boolean -> value
                        is Long -> value
                        is Double -> value
                        else -> value?.hashCode()
                    }
                )
        }
        return hashCode
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this.javaClass != other.javaClass) return false

        other as MultipartFormValue<*>

        if (name != other.name || contentType != other.contentType || filename != other.filename)
            return false

        return when {
            value is ByteArray && other.value is ByteArray -> value contentEquals other.value
            else -> value?.equals(other.value) ?: (other.value == null)
        }
    }

    override fun toString(): String =
        "MultipartFormValue{name=$name, contentType=$contentType, filename=$filename, value=${valueToString()}}"

    private fun valueToString(): String =
        when (value) {
            is ByteArray -> "ByteArray of size ${value.size}"
            else -> value.toString()
        }

    companion object {
        internal fun fromString(
            name: String,
            value: String,
            contentType: ContentType
        ): MultipartFormValue<String> = MultipartFormValue(name, value, contentType)

        internal fun fromBoolean(
            name: String,
            value: Boolean,
            contentType: ContentType,
        ): MultipartFormValue<Boolean> = MultipartFormValue(name, value, contentType)

        internal fun fromLong(
            name: String,
            value: Long,
            contentType: ContentType,
        ): MultipartFormValue<Long> = MultipartFormValue(name, value, contentType)

        internal fun fromDouble(
            name: String,
            value: Double,
            contentType: ContentType,
        ): MultipartFormValue<Double> = MultipartFormValue(name, value, contentType)

        internal fun <T : Enum> fromEnum(
            name: String,
            value: T,
            contentType: ContentType
        ): MultipartFormValue<T> = MultipartFormValue(name, value, contentType)

        internal fun fromByteArray(
            name: String,
            value: ByteArray,
            contentType: ContentType,
            filename: String? = null
        ): MultipartFormValue<ByteArray> = MultipartFormValue(name, value, contentType, filename)
    }
}

internal object ContentTypes {
    val DefaultText = ContentType.create(ContentType.TEXT_PLAIN.mimeType, Charset.forName("UTF-8"))
    val DefaultBinary = ContentType.DEFAULT_BINARY
}
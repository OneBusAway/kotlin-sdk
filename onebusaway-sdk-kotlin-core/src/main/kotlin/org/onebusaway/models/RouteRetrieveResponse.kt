// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.checkRequired
import org.onebusaway.core.immutableEmptyMap
import org.onebusaway.core.toImmutable

@NoAutoDetect
class RouteRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("currentTime")
    @ExcludeMissing
    private val currentTime: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("text") @ExcludeMissing private val text: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun data(): Data = data.getRequired("data")

    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime(): JsonField<Long> = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toResponseWrapper(): ResponseWrapper =
        ResponseWrapper.builder()
            .code(code)
            .currentTime(currentTime)
            .text(text)
            .version(version)
            .build()

    private var validated: Boolean = false

    fun validate(): RouteRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        currentTime()
        text()
        version()
        data().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RouteRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .code()
         * .currentTime()
         * .text()
         * .version()
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RouteRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(routeRetrieveResponse: RouteRetrieveResponse) = apply {
            code = routeRetrieveResponse.code
            currentTime = routeRetrieveResponse.currentTime
            text = routeRetrieveResponse.text
            version = routeRetrieveResponse.version
            data = routeRetrieveResponse.data
            additionalProperties = routeRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun data(data: Data) = data(JsonField.of(data))

        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): RouteRetrieveResponse =
            RouteRetrieveResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("entry")
        @ExcludeMissing
        private val entry: JsonField<Entry> = JsonMissing.of(),
        @JsonProperty("references")
        @ExcludeMissing
        private val references: JsonField<References> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entry(): Entry = entry.getRequired("entry")

        fun references(): References = references.getRequired("references")

        @JsonProperty("entry") @ExcludeMissing fun _entry(): JsonField<Entry> = entry

        @JsonProperty("references")
        @ExcludeMissing
        fun _references(): JsonField<References> = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            entry().validate()
            references().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .entry()
             * .references()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var entry: JsonField<Entry>? = null
            private var references: JsonField<References>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                entry = data.entry
                references = data.references
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

            fun references(references: References) = references(JsonField.of(references))

            fun references(references: JsonField<References>) = apply {
                this.references = references
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Data =
                Data(
                    checkRequired("entry", entry),
                    checkRequired("references", references),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Entry
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("agencyId")
            @ExcludeMissing
            private val agencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("color")
            @ExcludeMissing
            private val color: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("longName")
            @ExcludeMissing
            private val longName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nullSafeShortName")
            @ExcludeMissing
            private val nullSafeShortName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shortName")
            @ExcludeMissing
            private val shortName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("textColor")
            @ExcludeMissing
            private val textColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url")
            @ExcludeMissing
            private val url: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun agencyId(): String = agencyId.getRequired("agencyId")

            fun type(): Long = type.getRequired("type")

            fun color(): String? = color.getNullable("color")

            fun description(): String? = description.getNullable("description")

            fun longName(): String? = longName.getNullable("longName")

            fun nullSafeShortName(): String? = nullSafeShortName.getNullable("nullSafeShortName")

            fun shortName(): String? = shortName.getNullable("shortName")

            fun textColor(): String? = textColor.getNullable("textColor")

            fun url(): String? = url.getNullable("url")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("agencyId") @ExcludeMissing fun _agencyId(): JsonField<String> = agencyId

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Long> = type

            @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            @JsonProperty("longName") @ExcludeMissing fun _longName(): JsonField<String> = longName

            @JsonProperty("nullSafeShortName")
            @ExcludeMissing
            fun _nullSafeShortName(): JsonField<String> = nullSafeShortName

            @JsonProperty("shortName")
            @ExcludeMissing
            fun _shortName(): JsonField<String> = shortName

            @JsonProperty("textColor")
            @ExcludeMissing
            fun _textColor(): JsonField<String> = textColor

            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                id()
                agencyId()
                type()
                color()
                description()
                longName()
                nullSafeShortName()
                shortName()
                textColor()
                url()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Entry].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .agencyId()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var agencyId: JsonField<String>? = null
                private var type: JsonField<Long>? = null
                private var color: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var longName: JsonField<String> = JsonMissing.of()
                private var nullSafeShortName: JsonField<String> = JsonMissing.of()
                private var shortName: JsonField<String> = JsonMissing.of()
                private var textColor: JsonField<String> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(entry: Entry) = apply {
                    id = entry.id
                    agencyId = entry.agencyId
                    type = entry.type
                    color = entry.color
                    description = entry.description
                    longName = entry.longName
                    nullSafeShortName = entry.nullSafeShortName
                    shortName = entry.shortName
                    textColor = entry.textColor
                    url = entry.url
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

                fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

                fun type(type: Long) = type(JsonField.of(type))

                fun type(type: JsonField<Long>) = apply { this.type = type }

                fun color(color: String) = color(JsonField.of(color))

                fun color(color: JsonField<String>) = apply { this.color = color }

                fun description(description: String) = description(JsonField.of(description))

                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun longName(longName: String) = longName(JsonField.of(longName))

                fun longName(longName: JsonField<String>) = apply { this.longName = longName }

                fun nullSafeShortName(nullSafeShortName: String) =
                    nullSafeShortName(JsonField.of(nullSafeShortName))

                fun nullSafeShortName(nullSafeShortName: JsonField<String>) = apply {
                    this.nullSafeShortName = nullSafeShortName
                }

                fun shortName(shortName: String) = shortName(JsonField.of(shortName))

                fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

                fun textColor(textColor: String) = textColor(JsonField.of(textColor))

                fun textColor(textColor: JsonField<String>) = apply { this.textColor = textColor }

                fun url(url: String) = url(JsonField.of(url))

                fun url(url: JsonField<String>) = apply { this.url = url }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Entry =
                    Entry(
                        checkRequired("id", id),
                        checkRequired("agencyId", agencyId),
                        checkRequired("type", type),
                        color,
                        description,
                        longName,
                        nullSafeShortName,
                        shortName,
                        textColor,
                        url,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && id == other.id && agencyId == other.agencyId && type == other.type && color == other.color && description == other.description && longName == other.longName && nullSafeShortName == other.nullSafeShortName && shortName == other.shortName && textColor == other.textColor && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, agencyId, type, color, description, longName, nullSafeShortName, shortName, textColor, url, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{id=$id, agencyId=$agencyId, type=$type, color=$color, description=$description, longName=$longName, nullSafeShortName=$nullSafeShortName, shortName=$shortName, textColor=$textColor, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && entry == other.entry && references == other.references && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entry, references, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{entry=$entry, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RouteRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}

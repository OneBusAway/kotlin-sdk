// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable

@JsonDeserialize(builder = StopsForRouteListResponse.Builder::class)
@NoAutoDetect
class StopsForRouteListResponse
private constructor(
    private val code: JsonField<Long>,
    private val currentTime: JsonField<Long>,
    private val text: JsonField<String>,
    private val version: JsonField<Long>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun data(): Data = data.getRequired("data")

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime() = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text() = text

    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("data") @ExcludeMissing fun _data() = data

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

    fun validate(): StopsForRouteListResponse = apply {
        if (!validated) {
            code()
            currentTime()
            text()
            version()
            data().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var code: JsonField<Long> = JsonMissing.of()
        private var currentTime: JsonField<Long> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(stopsForRouteListResponse: StopsForRouteListResponse) = apply {
            code = stopsForRouteListResponse.code
            currentTime = stopsForRouteListResponse.currentTime
            text = stopsForRouteListResponse.text
            version = stopsForRouteListResponse.version
            data = stopsForRouteListResponse.data
            additionalProperties = stopsForRouteListResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        @JsonProperty("currentTime")
        @ExcludeMissing
        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        @JsonProperty("text")
        @ExcludeMissing
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): StopsForRouteListResponse =
            StopsForRouteListResponse(
                code,
                currentTime,
                text,
                version,
                data,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val entry: JsonField<Entry>,
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun entry(): Entry = entry.getRequired("entry")

        fun references(): References = references.getRequired("references")

        @JsonProperty("entry") @ExcludeMissing fun _entry() = entry

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                entry().validate()
                references().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var entry: JsonField<Entry> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                entry = data.entry
                references = data.references
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            @JsonProperty("entry")
            @ExcludeMissing
            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

            fun references(references: References) = references(JsonField.of(references))

            @JsonProperty("references")
            @ExcludeMissing
            fun references(references: JsonField<References>) = apply {
                this.references = references
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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
                    entry,
                    references,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry
        private constructor(
            private val polylines: JsonField<List<Polyline>>,
            private val routeId: JsonField<String>,
            private val stopGroupings: JsonField<List<StopGrouping>>,
            private val stopIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            fun polylines(): List<Polyline>? = polylines.getNullable("polylines")

            fun routeId(): String? = routeId.getNullable("routeId")

            fun stopGroupings(): List<StopGrouping>? = stopGroupings.getNullable("stopGroupings")

            fun stopIds(): List<String>? = stopIds.getNullable("stopIds")

            @JsonProperty("polylines") @ExcludeMissing fun _polylines() = polylines

            @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

            @JsonProperty("stopGroupings") @ExcludeMissing fun _stopGroupings() = stopGroupings

            @JsonProperty("stopIds") @ExcludeMissing fun _stopIds() = stopIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (!validated) {
                    polylines()?.forEach { it.validate() }
                    routeId()
                    stopGroupings()?.forEach { it.validate() }
                    stopIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var polylines: JsonField<List<Polyline>> = JsonMissing.of()
                private var routeId: JsonField<String> = JsonMissing.of()
                private var stopGroupings: JsonField<List<StopGrouping>> = JsonMissing.of()
                private var stopIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(entry: Entry) = apply {
                    polylines = entry.polylines
                    routeId = entry.routeId
                    stopGroupings = entry.stopGroupings
                    stopIds = entry.stopIds
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun polylines(polylines: List<Polyline>) = polylines(JsonField.of(polylines))

                @JsonProperty("polylines")
                @ExcludeMissing
                fun polylines(polylines: JsonField<List<Polyline>>) = apply {
                    this.polylines = polylines
                }

                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                @JsonProperty("routeId")
                @ExcludeMissing
                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                fun stopGroupings(stopGroupings: List<StopGrouping>) =
                    stopGroupings(JsonField.of(stopGroupings))

                @JsonProperty("stopGroupings")
                @ExcludeMissing
                fun stopGroupings(stopGroupings: JsonField<List<StopGrouping>>) = apply {
                    this.stopGroupings = stopGroupings
                }

                fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                @JsonProperty("stopIds")
                @ExcludeMissing
                fun stopIds(stopIds: JsonField<List<String>>) = apply { this.stopIds = stopIds }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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
                        polylines.map { it.toImmutable() },
                        routeId,
                        stopGroupings.map { it.toImmutable() },
                        stopIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = Polyline.Builder::class)
            @NoAutoDetect
            class Polyline
            private constructor(
                private val length: JsonField<Long>,
                private val levels: JsonField<String>,
                private val points: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                fun length(): Long? = length.getNullable("length")

                fun levels(): String? = levels.getNullable("levels")

                fun points(): String? = points.getNullable("points")

                @JsonProperty("length") @ExcludeMissing fun _length() = length

                @JsonProperty("levels") @ExcludeMissing fun _levels() = levels

                @JsonProperty("points") @ExcludeMissing fun _points() = points

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Polyline = apply {
                    if (!validated) {
                        length()
                        levels()
                        points()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var length: JsonField<Long> = JsonMissing.of()
                    private var levels: JsonField<String> = JsonMissing.of()
                    private var points: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(polyline: Polyline) = apply {
                        length = polyline.length
                        levels = polyline.levels
                        points = polyline.points
                        additionalProperties = polyline.additionalProperties.toMutableMap()
                    }

                    fun length(length: Long) = length(JsonField.of(length))

                    @JsonProperty("length")
                    @ExcludeMissing
                    fun length(length: JsonField<Long>) = apply { this.length = length }

                    fun levels(levels: String) = levels(JsonField.of(levels))

                    @JsonProperty("levels")
                    @ExcludeMissing
                    fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                    fun points(points: String) = points(JsonField.of(points))

                    @JsonProperty("points")
                    @ExcludeMissing
                    fun points(points: JsonField<String>) = apply { this.points = points }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): Polyline =
                        Polyline(
                            length,
                            levels,
                            points,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Polyline && length == other.length && levels == other.levels && points == other.points && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(length, levels, points, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Polyline{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = StopGrouping.Builder::class)
            @NoAutoDetect
            class StopGrouping
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<Name>,
                private val polylines: JsonField<List<Polyline>>,
                private val stopIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                fun id(): String? = id.getNullable("id")

                fun name(): Name? = name.getNullable("name")

                fun polylines(): List<Polyline>? = polylines.getNullable("polylines")

                fun stopIds(): List<String>? = stopIds.getNullable("stopIds")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("polylines") @ExcludeMissing fun _polylines() = polylines

                @JsonProperty("stopIds") @ExcludeMissing fun _stopIds() = stopIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): StopGrouping = apply {
                    if (!validated) {
                        id()
                        name()?.validate()
                        polylines()?.forEach { it.validate() }
                        stopIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<Name> = JsonMissing.of()
                    private var polylines: JsonField<List<Polyline>> = JsonMissing.of()
                    private var stopIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(stopGrouping: StopGrouping) = apply {
                        id = stopGrouping.id
                        name = stopGrouping.name
                        polylines = stopGrouping.polylines
                        stopIds = stopGrouping.stopIds
                        additionalProperties = stopGrouping.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: Name) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<Name>) = apply { this.name = name }

                    fun polylines(polylines: List<Polyline>) = polylines(JsonField.of(polylines))

                    @JsonProperty("polylines")
                    @ExcludeMissing
                    fun polylines(polylines: JsonField<List<Polyline>>) = apply {
                        this.polylines = polylines
                    }

                    fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                    @JsonProperty("stopIds")
                    @ExcludeMissing
                    fun stopIds(stopIds: JsonField<List<String>>) = apply { this.stopIds = stopIds }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): StopGrouping =
                        StopGrouping(
                            id,
                            name,
                            polylines.map { it.toImmutable() },
                            stopIds.map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = Name.Builder::class)
                @NoAutoDetect
                class Name
                private constructor(
                    private val name: JsonField<String>,
                    private val names: JsonField<List<String>>,
                    private val type: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    fun name(): String? = name.getNullable("name")

                    fun names(): List<String>? = names.getNullable("names")

                    fun type(): String? = type.getNullable("type")

                    @JsonProperty("name") @ExcludeMissing fun _name() = name

                    @JsonProperty("names") @ExcludeMissing fun _names() = names

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Name = apply {
                        if (!validated) {
                            name()
                            names()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var name: JsonField<String> = JsonMissing.of()
                        private var names: JsonField<List<String>> = JsonMissing.of()
                        private var type: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(name: Name) = apply {
                            this.name = name.name
                            names = name.names
                            type = name.type
                            additionalProperties = name.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun names(names: List<String>) = names(JsonField.of(names))

                        @JsonProperty("names")
                        @ExcludeMissing
                        fun names(names: JsonField<List<String>>) = apply { this.names = names }

                        fun type(type: String) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<String>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Name =
                            Name(
                                name,
                                names.map { it.toImmutable() },
                                type,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Name && name == other.name && names == other.names && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, names, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Name{name=$name, names=$names, type=$type, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Polyline.Builder::class)
                @NoAutoDetect
                class Polyline
                private constructor(
                    private val length: JsonField<Long>,
                    private val levels: JsonField<String>,
                    private val points: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    fun length(): Long? = length.getNullable("length")

                    fun levels(): String? = levels.getNullable("levels")

                    fun points(): String? = points.getNullable("points")

                    @JsonProperty("length") @ExcludeMissing fun _length() = length

                    @JsonProperty("levels") @ExcludeMissing fun _levels() = levels

                    @JsonProperty("points") @ExcludeMissing fun _points() = points

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Polyline = apply {
                        if (!validated) {
                            length()
                            levels()
                            points()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var length: JsonField<Long> = JsonMissing.of()
                        private var levels: JsonField<String> = JsonMissing.of()
                        private var points: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(polyline: Polyline) = apply {
                            length = polyline.length
                            levels = polyline.levels
                            points = polyline.points
                            additionalProperties = polyline.additionalProperties.toMutableMap()
                        }

                        fun length(length: Long) = length(JsonField.of(length))

                        @JsonProperty("length")
                        @ExcludeMissing
                        fun length(length: JsonField<Long>) = apply { this.length = length }

                        fun levels(levels: String) = levels(JsonField.of(levels))

                        @JsonProperty("levels")
                        @ExcludeMissing
                        fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                        fun points(points: String) = points(JsonField.of(points))

                        @JsonProperty("points")
                        @ExcludeMissing
                        fun points(points: JsonField<String>) = apply { this.points = points }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Polyline =
                            Polyline(
                                length,
                                levels,
                                points,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Polyline && length == other.length && levels == other.levels && points == other.points && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(length, levels, points, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Polyline{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StopGrouping && id == other.id && name == other.name && polylines == other.polylines && stopIds == other.stopIds && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, polylines, stopIds, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StopGrouping{id=$id, name=$name, polylines=$polylines, stopIds=$stopIds, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && polylines == other.polylines && routeId == other.routeId && stopGroupings == other.stopGroupings && stopIds == other.stopIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(polylines, routeId, stopGroupings, stopIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{polylines=$polylines, routeId=$routeId, stopGroupings=$stopGroupings, stopIds=$stopIds, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is StopsForRouteListResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StopsForRouteListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}

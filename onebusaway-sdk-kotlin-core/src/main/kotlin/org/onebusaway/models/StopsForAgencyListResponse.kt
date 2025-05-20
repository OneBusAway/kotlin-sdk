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
import org.onebusaway.core.checkKnown
import org.onebusaway.core.checkRequired
import org.onebusaway.core.immutableEmptyMap
import org.onebusaway.core.toImmutable
import org.onebusaway.errors.OnebusawaySdkInvalidDataException

@NoAutoDetect
class StopsForAgencyListResponse
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
    @JsonProperty("limitExceeded")
    @ExcludeMissing
    private val limitExceeded: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("list")
    @ExcludeMissing
    private val list: JsonField<kotlin.collections.List<List>> = JsonMissing.of(),
    @JsonProperty("references")
    @ExcludeMissing
    private val references: JsonField<References> = JsonMissing.of(),
    @JsonProperty("outOfRange")
    @ExcludeMissing
    private val outOfRange: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): Long = code.getRequired("code")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentTime(): Long = currentTime.getRequired("currentTime")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun list(): kotlin.collections.List<List> = list.getRequired("list")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun references(): References = references.getRequired("references")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outOfRange(): Boolean? = outOfRange.getNullable("outOfRange")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    /**
     * Returns the raw JSON value of [currentTime].
     *
     * Unlike [currentTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime(): JsonField<Long> = currentTime

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * Returns the raw JSON value of [limitExceeded].
     *
     * Unlike [limitExceeded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limitExceeded")
    @ExcludeMissing
    fun _limitExceeded(): JsonField<Boolean> = limitExceeded

    /**
     * Returns the raw JSON value of [list].
     *
     * Unlike [list], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("list")
    @ExcludeMissing
    fun _list(): JsonField<kotlin.collections.List<List>> = list

    /**
     * Returns the raw JSON value of [references].
     *
     * Unlike [references], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("references")
    @ExcludeMissing
    fun _references(): JsonField<References> = references

    /**
     * Returns the raw JSON value of [outOfRange].
     *
     * Unlike [outOfRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outOfRange") @ExcludeMissing fun _outOfRange(): JsonField<Boolean> = outOfRange

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

    fun validate(): StopsForAgencyListResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        currentTime()
        text()
        version()
        limitExceeded()
        list().forEach { it.validate() }
        references().validate()
        outOfRange()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StopsForAgencyListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .code()
         * .currentTime()
         * .text()
         * .version()
         * .limitExceeded()
         * .list()
         * .references()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [StopsForAgencyListResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var limitExceeded: JsonField<Boolean>? = null
        private var list: JsonField<MutableList<List>>? = null
        private var references: JsonField<References>? = null
        private var outOfRange: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(stopsForAgencyListResponse: StopsForAgencyListResponse) = apply {
            code = stopsForAgencyListResponse.code
            currentTime = stopsForAgencyListResponse.currentTime
            text = stopsForAgencyListResponse.text
            version = stopsForAgencyListResponse.version
            limitExceeded = stopsForAgencyListResponse.limitExceeded
            list = stopsForAgencyListResponse.list.map { it.toMutableList() }
            references = stopsForAgencyListResponse.references
            outOfRange = stopsForAgencyListResponse.outOfRange
            additionalProperties = stopsForAgencyListResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        /**
         * Sets [Builder.currentTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentTime] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun limitExceeded(limitExceeded: Boolean) = limitExceeded(JsonField.of(limitExceeded))

        /**
         * Sets [Builder.limitExceeded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitExceeded] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun limitExceeded(limitExceeded: JsonField<Boolean>) = apply {
            this.limitExceeded = limitExceeded
        }

        fun list(list: kotlin.collections.List<List>) = list(JsonField.of(list))

        /**
         * Sets [Builder.list] to an arbitrary JSON value.
         *
         * You should usually call [Builder.list] with a well-typed `List<List>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun list(list: JsonField<kotlin.collections.List<List>>) = apply {
            this.list = list.map { it.toMutableList() }
        }

        /**
         * Adds a single [List] to [Builder.list].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addList(list: List) = apply {
            this.list =
                (this.list ?: JsonField.of(mutableListOf())).also {
                    checkKnown("list", it).add(list)
                }
        }

        fun references(references: References) = references(JsonField.of(references))

        /**
         * Sets [Builder.references] to an arbitrary JSON value.
         *
         * You should usually call [Builder.references] with a well-typed [References] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun references(references: JsonField<References>) = apply { this.references = references }

        fun outOfRange(outOfRange: Boolean) = outOfRange(JsonField.of(outOfRange))

        /**
         * Sets [Builder.outOfRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outOfRange] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outOfRange(outOfRange: JsonField<Boolean>) = apply { this.outOfRange = outOfRange }

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

        fun build(): StopsForAgencyListResponse =
            StopsForAgencyListResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("limitExceeded", limitExceeded),
                checkRequired("list", list).map { it.toImmutable() },
                checkRequired("references", references),
                outOfRange,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class List
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing private val lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing private val lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent")
        @ExcludeMissing
        private val parent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routeIds")
        @ExcludeMissing
        private val routeIds: JsonField<kotlin.collections.List<String>> = JsonMissing.of(),
        @JsonProperty("staticRouteIds")
        @ExcludeMissing
        private val staticRouteIds: JsonField<kotlin.collections.List<String>> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locationType")
        @ExcludeMissing
        private val locationType: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("wheelchairBoarding")
        @ExcludeMissing
        private val wheelchairBoarding: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lat(): Double = lat.getRequired("lat")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lon(): Double = lon.getRequired("lon")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parent(): String = parent.getRequired("parent")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routeIds(): kotlin.collections.List<String> = routeIds.getRequired("routeIds")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun staticRouteIds(): kotlin.collections.List<String> =
            staticRouteIds.getRequired("staticRouteIds")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun code(): String? = code.getNullable("code")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun direction(): String? = direction.getNullable("direction")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun locationType(): Long? = locationType.getNullable("locationType")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun wheelchairBoarding(): String? = wheelchairBoarding.getNullable("wheelchairBoarding")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [parent].
         *
         * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<String> = parent

        /**
         * Returns the raw JSON value of [routeIds].
         *
         * Unlike [routeIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routeIds")
        @ExcludeMissing
        fun _routeIds(): JsonField<kotlin.collections.List<String>> = routeIds

        /**
         * Returns the raw JSON value of [staticRouteIds].
         *
         * Unlike [staticRouteIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("staticRouteIds")
        @ExcludeMissing
        fun _staticRouteIds(): JsonField<kotlin.collections.List<String>> = staticRouteIds

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /**
         * Returns the raw JSON value of [locationType].
         *
         * Unlike [locationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("locationType")
        @ExcludeMissing
        fun _locationType(): JsonField<Long> = locationType

        /**
         * Returns the raw JSON value of [wheelchairBoarding].
         *
         * Unlike [wheelchairBoarding], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("wheelchairBoarding")
        @ExcludeMissing
        fun _wheelchairBoarding(): JsonField<String> = wheelchairBoarding

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): List = apply {
            if (validated) {
                return@apply
            }

            id()
            lat()
            lon()
            name()
            parent()
            routeIds()
            staticRouteIds()
            code()
            direction()
            locationType()
            wheelchairBoarding()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [List].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .lat()
             * .lon()
             * .name()
             * .parent()
             * .routeIds()
             * .staticRouteIds()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [List]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var lat: JsonField<Double>? = null
            private var lon: JsonField<Double>? = null
            private var name: JsonField<String>? = null
            private var parent: JsonField<String>? = null
            private var routeIds: JsonField<MutableList<String>>? = null
            private var staticRouteIds: JsonField<MutableList<String>>? = null
            private var code: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<String> = JsonMissing.of()
            private var locationType: JsonField<Long> = JsonMissing.of()
            private var wheelchairBoarding: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(list: List) = apply {
                id = list.id
                lat = list.lat
                lon = list.lon
                name = list.name
                parent = list.parent
                routeIds = list.routeIds.map { it.toMutableList() }
                staticRouteIds = list.staticRouteIds.map { it.toMutableList() }
                code = list.code
                direction = list.direction
                locationType = list.locationType
                wheelchairBoarding = list.wheelchairBoarding
                additionalProperties = list.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            fun lon(lon: Double) = lon(JsonField.of(lon))

            /**
             * Sets [Builder.lon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun parent(parent: String) = parent(JsonField.of(parent))

            /**
             * Sets [Builder.parent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parent] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parent(parent: JsonField<String>) = apply { this.parent = parent }

            fun routeIds(routeIds: kotlin.collections.List<String>) =
                routeIds(JsonField.of(routeIds))

            /**
             * Sets [Builder.routeIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routeIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routeIds(routeIds: JsonField<kotlin.collections.List<String>>) = apply {
                this.routeIds = routeIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [routeIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRouteId(routeId: String) = apply {
                routeIds =
                    (routeIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("routeIds", it).add(routeId)
                    }
            }

            fun staticRouteIds(staticRouteIds: kotlin.collections.List<String>) =
                staticRouteIds(JsonField.of(staticRouteIds))

            /**
             * Sets [Builder.staticRouteIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.staticRouteIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun staticRouteIds(staticRouteIds: JsonField<kotlin.collections.List<String>>) = apply {
                this.staticRouteIds = staticRouteIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [staticRouteIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStaticRouteId(staticRouteId: String) = apply {
                staticRouteIds =
                    (staticRouteIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("staticRouteIds", it).add(staticRouteId)
                    }
            }

            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun direction(direction: String) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

            fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

            /**
             * Sets [Builder.locationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationType] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationType(locationType: JsonField<Long>) = apply {
                this.locationType = locationType
            }

            fun wheelchairBoarding(wheelchairBoarding: String) =
                wheelchairBoarding(JsonField.of(wheelchairBoarding))

            /**
             * Sets [Builder.wheelchairBoarding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wheelchairBoarding] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wheelchairBoarding(wheelchairBoarding: JsonField<String>) = apply {
                this.wheelchairBoarding = wheelchairBoarding
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

            fun build(): List =
                List(
                    checkRequired("id", id),
                    checkRequired("lat", lat),
                    checkRequired("lon", lon),
                    checkRequired("name", name),
                    checkRequired("parent", parent),
                    checkRequired("routeIds", routeIds).map { it.toImmutable() },
                    checkRequired("staticRouteIds", staticRouteIds).map { it.toImmutable() },
                    code,
                    direction,
                    locationType,
                    wheelchairBoarding,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is List && id == other.id && lat == other.lat && lon == other.lon && name == other.name && parent == other.parent && routeIds == other.routeIds && staticRouteIds == other.staticRouteIds && code == other.code && direction == other.direction && locationType == other.locationType && wheelchairBoarding == other.wheelchairBoarding && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, lat, lon, name, parent, routeIds, staticRouteIds, code, direction, locationType, wheelchairBoarding, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "List{id=$id, lat=$lat, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, code=$code, direction=$direction, locationType=$locationType, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StopsForAgencyListResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && limitExceeded == other.limitExceeded && list == other.list && references == other.references && outOfRange == other.outOfRange && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, limitExceeded, list, references, outOfRange, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StopsForAgencyListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, limitExceeded=$limitExceeded, list=$list, references=$references, outOfRange=$outOfRange, additionalProperties=$additionalProperties}"
}

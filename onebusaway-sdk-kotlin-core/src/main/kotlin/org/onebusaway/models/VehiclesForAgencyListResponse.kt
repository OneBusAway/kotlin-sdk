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

@NoAutoDetect
class VehiclesForAgencyListResponse
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

    fun validate(): VehiclesForAgencyListResponse = apply {
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
         * Returns a mutable builder for constructing an instance of
         * [VehiclesForAgencyListResponse].
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

    /** A builder for [VehiclesForAgencyListResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(vehiclesForAgencyListResponse: VehiclesForAgencyListResponse) = apply {
            code = vehiclesForAgencyListResponse.code
            currentTime = vehiclesForAgencyListResponse.currentTime
            text = vehiclesForAgencyListResponse.text
            version = vehiclesForAgencyListResponse.version
            data = vehiclesForAgencyListResponse.data
            additionalProperties = vehiclesForAgencyListResponse.additionalProperties.toMutableMap()
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

        fun build(): VehiclesForAgencyListResponse =
            VehiclesForAgencyListResponse(
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
        @JsonProperty("limitExceeded")
        @ExcludeMissing
        private val limitExceeded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("list")
        @ExcludeMissing
        private val list: JsonField<kotlin.collections.List<List>> = JsonMissing.of(),
        @JsonProperty("references")
        @ExcludeMissing
        private val references: JsonField<References> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

        fun list(): kotlin.collections.List<List> = list.getRequired("list")

        fun references(): References = references.getRequired("references")

        @JsonProperty("limitExceeded")
        @ExcludeMissing
        fun _limitExceeded(): JsonField<Boolean> = limitExceeded

        @JsonProperty("list")
        @ExcludeMissing
        fun _list(): JsonField<kotlin.collections.List<List>> = list

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

            limitExceeded()
            list().forEach { it.validate() }
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
             * .limitExceeded()
             * .list()
             * .references()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var limitExceeded: JsonField<Boolean>? = null
            private var list: JsonField<MutableList<List>>? = null
            private var references: JsonField<References>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                limitExceeded = data.limitExceeded
                list = data.list.map { it.toMutableList() }
                references = data.references
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun limitExceeded(limitExceeded: Boolean) = limitExceeded(JsonField.of(limitExceeded))

            fun limitExceeded(limitExceeded: JsonField<Boolean>) = apply {
                this.limitExceeded = limitExceeded
            }

            fun list(list: kotlin.collections.List<List>) = list(JsonField.of(list))

            fun list(list: JsonField<kotlin.collections.List<List>>) = apply {
                this.list = list.map { it.toMutableList() }
            }

            fun addList(list: List) = apply {
                this.list =
                    (this.list ?: JsonField.of(mutableListOf())).also {
                        checkKnown("list", it).add(list)
                    }
            }

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
                    checkRequired("limitExceeded", limitExceeded),
                    checkRequired("list", list).map { it.toImmutable() },
                    checkRequired("references", references),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class List
        @JsonCreator
        private constructor(
            @JsonProperty("lastLocationUpdateTime")
            @ExcludeMissing
            private val lastLocationUpdateTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lastUpdateTime")
            @ExcludeMissing
            private val lastUpdateTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            private val location: JsonField<Location> = JsonMissing.of(),
            @JsonProperty("tripId")
            @ExcludeMissing
            private val tripId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tripStatus")
            @ExcludeMissing
            private val tripStatus: JsonField<TripStatus> = JsonMissing.of(),
            @JsonProperty("vehicleId")
            @ExcludeMissing
            private val vehicleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("occupancyCapacity")
            @ExcludeMissing
            private val occupancyCapacity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("occupancyCount")
            @ExcludeMissing
            private val occupancyCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("occupancyStatus")
            @ExcludeMissing
            private val occupancyStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phase")
            @ExcludeMissing
            private val phase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            private val status: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun lastLocationUpdateTime(): Long =
                lastLocationUpdateTime.getRequired("lastLocationUpdateTime")

            fun lastUpdateTime(): Long = lastUpdateTime.getRequired("lastUpdateTime")

            fun location(): Location = location.getRequired("location")

            fun tripId(): String = tripId.getRequired("tripId")

            fun tripStatus(): TripStatus = tripStatus.getRequired("tripStatus")

            fun vehicleId(): String = vehicleId.getRequired("vehicleId")

            fun occupancyCapacity(): Long? = occupancyCapacity.getNullable("occupancyCapacity")

            fun occupancyCount(): Long? = occupancyCount.getNullable("occupancyCount")

            fun occupancyStatus(): String? = occupancyStatus.getNullable("occupancyStatus")

            fun phase(): String? = phase.getNullable("phase")

            fun status(): String? = status.getNullable("status")

            @JsonProperty("lastLocationUpdateTime")
            @ExcludeMissing
            fun _lastLocationUpdateTime(): JsonField<Long> = lastLocationUpdateTime

            @JsonProperty("lastUpdateTime")
            @ExcludeMissing
            fun _lastUpdateTime(): JsonField<Long> = lastUpdateTime

            @JsonProperty("location")
            @ExcludeMissing
            fun _location(): JsonField<Location> = location

            @JsonProperty("tripId") @ExcludeMissing fun _tripId(): JsonField<String> = tripId

            @JsonProperty("tripStatus")
            @ExcludeMissing
            fun _tripStatus(): JsonField<TripStatus> = tripStatus

            @JsonProperty("vehicleId")
            @ExcludeMissing
            fun _vehicleId(): JsonField<String> = vehicleId

            @JsonProperty("occupancyCapacity")
            @ExcludeMissing
            fun _occupancyCapacity(): JsonField<Long> = occupancyCapacity

            @JsonProperty("occupancyCount")
            @ExcludeMissing
            fun _occupancyCount(): JsonField<Long> = occupancyCount

            @JsonProperty("occupancyStatus")
            @ExcludeMissing
            fun _occupancyStatus(): JsonField<String> = occupancyStatus

            @JsonProperty("phase") @ExcludeMissing fun _phase(): JsonField<String> = phase

            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): List = apply {
                if (validated) {
                    return@apply
                }

                lastLocationUpdateTime()
                lastUpdateTime()
                location().validate()
                tripId()
                tripStatus().validate()
                vehicleId()
                occupancyCapacity()
                occupancyCount()
                occupancyStatus()
                phase()
                status()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [List].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .lastLocationUpdateTime()
                 * .lastUpdateTime()
                 * .location()
                 * .tripId()
                 * .tripStatus()
                 * .vehicleId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [List]. */
            class Builder internal constructor() {

                private var lastLocationUpdateTime: JsonField<Long>? = null
                private var lastUpdateTime: JsonField<Long>? = null
                private var location: JsonField<Location>? = null
                private var tripId: JsonField<String>? = null
                private var tripStatus: JsonField<TripStatus>? = null
                private var vehicleId: JsonField<String>? = null
                private var occupancyCapacity: JsonField<Long> = JsonMissing.of()
                private var occupancyCount: JsonField<Long> = JsonMissing.of()
                private var occupancyStatus: JsonField<String> = JsonMissing.of()
                private var phase: JsonField<String> = JsonMissing.of()
                private var status: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(list: List) = apply {
                    lastLocationUpdateTime = list.lastLocationUpdateTime
                    lastUpdateTime = list.lastUpdateTime
                    location = list.location
                    tripId = list.tripId
                    tripStatus = list.tripStatus
                    vehicleId = list.vehicleId
                    occupancyCapacity = list.occupancyCapacity
                    occupancyCount = list.occupancyCount
                    occupancyStatus = list.occupancyStatus
                    phase = list.phase
                    status = list.status
                    additionalProperties = list.additionalProperties.toMutableMap()
                }

                fun lastLocationUpdateTime(lastLocationUpdateTime: Long) =
                    lastLocationUpdateTime(JsonField.of(lastLocationUpdateTime))

                fun lastLocationUpdateTime(lastLocationUpdateTime: JsonField<Long>) = apply {
                    this.lastLocationUpdateTime = lastLocationUpdateTime
                }

                fun lastUpdateTime(lastUpdateTime: Long) =
                    lastUpdateTime(JsonField.of(lastUpdateTime))

                fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                    this.lastUpdateTime = lastUpdateTime
                }

                fun location(location: Location) = location(JsonField.of(location))

                fun location(location: JsonField<Location>) = apply { this.location = location }

                fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                fun tripStatus(tripStatus: TripStatus) = tripStatus(JsonField.of(tripStatus))

                fun tripStatus(tripStatus: JsonField<TripStatus>) = apply {
                    this.tripStatus = tripStatus
                }

                fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                fun vehicleId(vehicleId: JsonField<String>) = apply { this.vehicleId = vehicleId }

                fun occupancyCapacity(occupancyCapacity: Long) =
                    occupancyCapacity(JsonField.of(occupancyCapacity))

                fun occupancyCapacity(occupancyCapacity: JsonField<Long>) = apply {
                    this.occupancyCapacity = occupancyCapacity
                }

                fun occupancyCount(occupancyCount: Long) =
                    occupancyCount(JsonField.of(occupancyCount))

                fun occupancyCount(occupancyCount: JsonField<Long>) = apply {
                    this.occupancyCount = occupancyCount
                }

                fun occupancyStatus(occupancyStatus: String) =
                    occupancyStatus(JsonField.of(occupancyStatus))

                fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                    this.occupancyStatus = occupancyStatus
                }

                fun phase(phase: String) = phase(JsonField.of(phase))

                fun phase(phase: JsonField<String>) = apply { this.phase = phase }

                fun status(status: String) = status(JsonField.of(status))

                fun status(status: JsonField<String>) = apply { this.status = status }

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

                fun build(): List =
                    List(
                        checkRequired("lastLocationUpdateTime", lastLocationUpdateTime),
                        checkRequired("lastUpdateTime", lastUpdateTime),
                        checkRequired("location", location),
                        checkRequired("tripId", tripId),
                        checkRequired("tripStatus", tripStatus),
                        checkRequired("vehicleId", vehicleId),
                        occupancyCapacity,
                        occupancyCount,
                        occupancyStatus,
                        phase,
                        status,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Location
            @JsonCreator
            private constructor(
                @JsonProperty("lat")
                @ExcludeMissing
                private val lat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("lon")
                @ExcludeMissing
                private val lon: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun lat(): Double? = lat.getNullable("lat")

                fun lon(): Double? = lon.getNullable("lon")

                @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Location = apply {
                    if (validated) {
                        return@apply
                    }

                    lat()
                    lon()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Location]. */
                    fun builder() = Builder()
                }

                /** A builder for [Location]. */
                class Builder internal constructor() {

                    private var lat: JsonField<Double> = JsonMissing.of()
                    private var lon: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(location: Location) = apply {
                        lat = location.lat
                        lon = location.lon
                        additionalProperties = location.additionalProperties.toMutableMap()
                    }

                    fun lat(lat: Double) = lat(JsonField.of(lat))

                    fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                    fun lon(lon: Double) = lon(JsonField.of(lon))

                    fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

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

                    fun build(): Location = Location(lat, lon, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Location && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Location{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class TripStatus
            @JsonCreator
            private constructor(
                @JsonProperty("activeTripId")
                @ExcludeMissing
                private val activeTripId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("blockTripSequence")
                @ExcludeMissing
                private val blockTripSequence: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("closestStop")
                @ExcludeMissing
                private val closestStop: JsonField<String> = JsonMissing.of(),
                @JsonProperty("distanceAlongTrip")
                @ExcludeMissing
                private val distanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("lastKnownDistanceAlongTrip")
                @ExcludeMissing
                private val lastKnownDistanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("lastLocationUpdateTime")
                @ExcludeMissing
                private val lastLocationUpdateTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("lastUpdateTime")
                @ExcludeMissing
                private val lastUpdateTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("occupancyCapacity")
                @ExcludeMissing
                private val occupancyCapacity: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("occupancyCount")
                @ExcludeMissing
                private val occupancyCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("occupancyStatus")
                @ExcludeMissing
                private val occupancyStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phase")
                @ExcludeMissing
                private val phase: JsonField<String> = JsonMissing.of(),
                @JsonProperty("predicted")
                @ExcludeMissing
                private val predicted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("scheduleDeviation")
                @ExcludeMissing
                private val scheduleDeviation: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("serviceDate")
                @ExcludeMissing
                private val serviceDate: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                private val status: JsonField<String> = JsonMissing.of(),
                @JsonProperty("totalDistanceAlongTrip")
                @ExcludeMissing
                private val totalDistanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("closestStopTimeOffset")
                @ExcludeMissing
                private val closestStopTimeOffset: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("frequency")
                @ExcludeMissing
                private val frequency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lastKnownLocation")
                @ExcludeMissing
                private val lastKnownLocation: JsonField<LastKnownLocation> = JsonMissing.of(),
                @JsonProperty("lastKnownOrientation")
                @ExcludeMissing
                private val lastKnownOrientation: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nextStop")
                @ExcludeMissing
                private val nextStop: JsonField<String> = JsonMissing.of(),
                @JsonProperty("nextStopTimeOffset")
                @ExcludeMissing
                private val nextStopTimeOffset: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("orientation")
                @ExcludeMissing
                private val orientation: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("position")
                @ExcludeMissing
                private val position: JsonField<Position> = JsonMissing.of(),
                @JsonProperty("scheduledDistanceAlongTrip")
                @ExcludeMissing
                private val scheduledDistanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("situationIds")
                @ExcludeMissing
                private val situationIds: JsonField<kotlin.collections.List<String>> =
                    JsonMissing.of(),
                @JsonProperty("vehicleId")
                @ExcludeMissing
                private val vehicleId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Trip ID of the trip the vehicle is actively serving. */
                fun activeTripId(): String = activeTripId.getRequired("activeTripId")

                /** Index of the active trip into the sequence of trips for the active block. */
                fun blockTripSequence(): Long = blockTripSequence.getRequired("blockTripSequence")

                /** ID of the closest stop to the current location of the transit vehicle. */
                fun closestStop(): String = closestStop.getRequired("closestStop")

                /**
                 * Distance, in meters, the transit vehicle has progressed along the active trip.
                 */
                fun distanceAlongTrip(): Double = distanceAlongTrip.getRequired("distanceAlongTrip")

                /**
                 * Last known distance along the trip received in real-time from the transit
                 * vehicle.
                 */
                fun lastKnownDistanceAlongTrip(): Double =
                    lastKnownDistanceAlongTrip.getRequired("lastKnownDistanceAlongTrip")

                /**
                 * Timestamp of the last known real-time location update from the transit vehicle.
                 */
                fun lastLocationUpdateTime(): Long =
                    lastLocationUpdateTime.getRequired("lastLocationUpdateTime")

                /** Timestamp of the last known real-time update from the transit vehicle. */
                fun lastUpdateTime(): Long = lastUpdateTime.getRequired("lastUpdateTime")

                /** Capacity of the transit vehicle in terms of occupancy. */
                fun occupancyCapacity(): Long = occupancyCapacity.getRequired("occupancyCapacity")

                /** Current count of occupants in the transit vehicle. */
                fun occupancyCount(): Long = occupancyCount.getRequired("occupancyCount")

                /** Current occupancy status of the transit vehicle. */
                fun occupancyStatus(): String = occupancyStatus.getRequired("occupancyStatus")

                /** Current journey phase of the trip. */
                fun phase(): String = phase.getRequired("phase")

                /** Indicates if real-time arrival info is available for this trip. */
                fun predicted(): Boolean = predicted.getRequired("predicted")

                /**
                 * Deviation from the schedule in seconds (positive for late, negative for early).
                 */
                fun scheduleDeviation(): Long = scheduleDeviation.getRequired("scheduleDeviation")

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                /** Current status modifiers for the trip. */
                fun status(): String = status.getRequired("status")

                /** Total length of the trip, in meters. */
                fun totalDistanceAlongTrip(): Double =
                    totalDistanceAlongTrip.getRequired("totalDistanceAlongTrip")

                /**
                 * Time offset from the closest stop to the current position of the transit vehicle
                 * (in seconds).
                 */
                fun closestStopTimeOffset(): Long? =
                    closestStopTimeOffset.getNullable("closestStopTimeOffset")

                /** Information about frequency-based scheduling, if applicable to the trip. */
                fun frequency(): String? = frequency.getNullable("frequency")

                /** Last known location of the transit vehicle. */
                fun lastKnownLocation(): LastKnownLocation? =
                    lastKnownLocation.getNullable("lastKnownLocation")

                /** Last known orientation value received in real-time from the transit vehicle. */
                fun lastKnownOrientation(): Double? =
                    lastKnownOrientation.getNullable("lastKnownOrientation")

                /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                fun nextStop(): String? = nextStop.getNullable("nextStop")

                /**
                 * Time offset from the next stop to the current position of the transit vehicle (in
                 * seconds).
                 */
                fun nextStopTimeOffset(): Long? =
                    nextStopTimeOffset.getNullable("nextStopTimeOffset")

                /** Orientation of the transit vehicle, represented as an angle in degrees. */
                fun orientation(): Double? = orientation.getNullable("orientation")

                /** Current position of the transit vehicle. */
                fun position(): Position? = position.getNullable("position")

                /**
                 * Distance, in meters, the transit vehicle is scheduled to have progressed along
                 * the active trip.
                 */
                fun scheduledDistanceAlongTrip(): Double? =
                    scheduledDistanceAlongTrip.getNullable("scheduledDistanceAlongTrip")

                /** References to situation elements (if any) applicable to this trip. */
                fun situationIds(): kotlin.collections.List<String>? =
                    situationIds.getNullable("situationIds")

                /** ID of the transit vehicle currently serving the trip. */
                fun vehicleId(): String? = vehicleId.getNullable("vehicleId")

                /** Trip ID of the trip the vehicle is actively serving. */
                @JsonProperty("activeTripId")
                @ExcludeMissing
                fun _activeTripId(): JsonField<String> = activeTripId

                /** Index of the active trip into the sequence of trips for the active block. */
                @JsonProperty("blockTripSequence")
                @ExcludeMissing
                fun _blockTripSequence(): JsonField<Long> = blockTripSequence

                /** ID of the closest stop to the current location of the transit vehicle. */
                @JsonProperty("closestStop")
                @ExcludeMissing
                fun _closestStop(): JsonField<String> = closestStop

                /**
                 * Distance, in meters, the transit vehicle has progressed along the active trip.
                 */
                @JsonProperty("distanceAlongTrip")
                @ExcludeMissing
                fun _distanceAlongTrip(): JsonField<Double> = distanceAlongTrip

                /**
                 * Last known distance along the trip received in real-time from the transit
                 * vehicle.
                 */
                @JsonProperty("lastKnownDistanceAlongTrip")
                @ExcludeMissing
                fun _lastKnownDistanceAlongTrip(): JsonField<Double> = lastKnownDistanceAlongTrip

                /**
                 * Timestamp of the last known real-time location update from the transit vehicle.
                 */
                @JsonProperty("lastLocationUpdateTime")
                @ExcludeMissing
                fun _lastLocationUpdateTime(): JsonField<Long> = lastLocationUpdateTime

                /** Timestamp of the last known real-time update from the transit vehicle. */
                @JsonProperty("lastUpdateTime")
                @ExcludeMissing
                fun _lastUpdateTime(): JsonField<Long> = lastUpdateTime

                /** Capacity of the transit vehicle in terms of occupancy. */
                @JsonProperty("occupancyCapacity")
                @ExcludeMissing
                fun _occupancyCapacity(): JsonField<Long> = occupancyCapacity

                /** Current count of occupants in the transit vehicle. */
                @JsonProperty("occupancyCount")
                @ExcludeMissing
                fun _occupancyCount(): JsonField<Long> = occupancyCount

                /** Current occupancy status of the transit vehicle. */
                @JsonProperty("occupancyStatus")
                @ExcludeMissing
                fun _occupancyStatus(): JsonField<String> = occupancyStatus

                /** Current journey phase of the trip. */
                @JsonProperty("phase") @ExcludeMissing fun _phase(): JsonField<String> = phase

                /** Indicates if real-time arrival info is available for this trip. */
                @JsonProperty("predicted")
                @ExcludeMissing
                fun _predicted(): JsonField<Boolean> = predicted

                /**
                 * Deviation from the schedule in seconds (positive for late, negative for early).
                 */
                @JsonProperty("scheduleDeviation")
                @ExcludeMissing
                fun _scheduleDeviation(): JsonField<Long> = scheduleDeviation

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                @JsonProperty("serviceDate")
                @ExcludeMissing
                fun _serviceDate(): JsonField<Long> = serviceDate

                /** Current status modifiers for the trip. */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                /** Total length of the trip, in meters. */
                @JsonProperty("totalDistanceAlongTrip")
                @ExcludeMissing
                fun _totalDistanceAlongTrip(): JsonField<Double> = totalDistanceAlongTrip

                /**
                 * Time offset from the closest stop to the current position of the transit vehicle
                 * (in seconds).
                 */
                @JsonProperty("closestStopTimeOffset")
                @ExcludeMissing
                fun _closestStopTimeOffset(): JsonField<Long> = closestStopTimeOffset

                /** Information about frequency-based scheduling, if applicable to the trip. */
                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<String> = frequency

                /** Last known location of the transit vehicle. */
                @JsonProperty("lastKnownLocation")
                @ExcludeMissing
                fun _lastKnownLocation(): JsonField<LastKnownLocation> = lastKnownLocation

                /** Last known orientation value received in real-time from the transit vehicle. */
                @JsonProperty("lastKnownOrientation")
                @ExcludeMissing
                fun _lastKnownOrientation(): JsonField<Double> = lastKnownOrientation

                /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                @JsonProperty("nextStop")
                @ExcludeMissing
                fun _nextStop(): JsonField<String> = nextStop

                /**
                 * Time offset from the next stop to the current position of the transit vehicle (in
                 * seconds).
                 */
                @JsonProperty("nextStopTimeOffset")
                @ExcludeMissing
                fun _nextStopTimeOffset(): JsonField<Long> = nextStopTimeOffset

                /** Orientation of the transit vehicle, represented as an angle in degrees. */
                @JsonProperty("orientation")
                @ExcludeMissing
                fun _orientation(): JsonField<Double> = orientation

                /** Current position of the transit vehicle. */
                @JsonProperty("position")
                @ExcludeMissing
                fun _position(): JsonField<Position> = position

                /**
                 * Distance, in meters, the transit vehicle is scheduled to have progressed along
                 * the active trip.
                 */
                @JsonProperty("scheduledDistanceAlongTrip")
                @ExcludeMissing
                fun _scheduledDistanceAlongTrip(): JsonField<Double> = scheduledDistanceAlongTrip

                /** References to situation elements (if any) applicable to this trip. */
                @JsonProperty("situationIds")
                @ExcludeMissing
                fun _situationIds(): JsonField<kotlin.collections.List<String>> = situationIds

                /** ID of the transit vehicle currently serving the trip. */
                @JsonProperty("vehicleId")
                @ExcludeMissing
                fun _vehicleId(): JsonField<String> = vehicleId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TripStatus = apply {
                    if (validated) {
                        return@apply
                    }

                    activeTripId()
                    blockTripSequence()
                    closestStop()
                    distanceAlongTrip()
                    lastKnownDistanceAlongTrip()
                    lastLocationUpdateTime()
                    lastUpdateTime()
                    occupancyCapacity()
                    occupancyCount()
                    occupancyStatus()
                    phase()
                    predicted()
                    scheduleDeviation()
                    serviceDate()
                    status()
                    totalDistanceAlongTrip()
                    closestStopTimeOffset()
                    frequency()
                    lastKnownLocation()?.validate()
                    lastKnownOrientation()
                    nextStop()
                    nextStopTimeOffset()
                    orientation()
                    position()?.validate()
                    scheduledDistanceAlongTrip()
                    situationIds()
                    vehicleId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [TripStatus].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .activeTripId()
                     * .blockTripSequence()
                     * .closestStop()
                     * .distanceAlongTrip()
                     * .lastKnownDistanceAlongTrip()
                     * .lastLocationUpdateTime()
                     * .lastUpdateTime()
                     * .occupancyCapacity()
                     * .occupancyCount()
                     * .occupancyStatus()
                     * .phase()
                     * .predicted()
                     * .scheduleDeviation()
                     * .serviceDate()
                     * .status()
                     * .totalDistanceAlongTrip()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [TripStatus]. */
                class Builder internal constructor() {

                    private var activeTripId: JsonField<String>? = null
                    private var blockTripSequence: JsonField<Long>? = null
                    private var closestStop: JsonField<String>? = null
                    private var distanceAlongTrip: JsonField<Double>? = null
                    private var lastKnownDistanceAlongTrip: JsonField<Double>? = null
                    private var lastLocationUpdateTime: JsonField<Long>? = null
                    private var lastUpdateTime: JsonField<Long>? = null
                    private var occupancyCapacity: JsonField<Long>? = null
                    private var occupancyCount: JsonField<Long>? = null
                    private var occupancyStatus: JsonField<String>? = null
                    private var phase: JsonField<String>? = null
                    private var predicted: JsonField<Boolean>? = null
                    private var scheduleDeviation: JsonField<Long>? = null
                    private var serviceDate: JsonField<Long>? = null
                    private var status: JsonField<String>? = null
                    private var totalDistanceAlongTrip: JsonField<Double>? = null
                    private var closestStopTimeOffset: JsonField<Long> = JsonMissing.of()
                    private var frequency: JsonField<String> = JsonMissing.of()
                    private var lastKnownLocation: JsonField<LastKnownLocation> = JsonMissing.of()
                    private var lastKnownOrientation: JsonField<Double> = JsonMissing.of()
                    private var nextStop: JsonField<String> = JsonMissing.of()
                    private var nextStopTimeOffset: JsonField<Long> = JsonMissing.of()
                    private var orientation: JsonField<Double> = JsonMissing.of()
                    private var position: JsonField<Position> = JsonMissing.of()
                    private var scheduledDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                    private var situationIds: JsonField<MutableList<String>>? = null
                    private var vehicleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tripStatus: TripStatus) = apply {
                        activeTripId = tripStatus.activeTripId
                        blockTripSequence = tripStatus.blockTripSequence
                        closestStop = tripStatus.closestStop
                        distanceAlongTrip = tripStatus.distanceAlongTrip
                        lastKnownDistanceAlongTrip = tripStatus.lastKnownDistanceAlongTrip
                        lastLocationUpdateTime = tripStatus.lastLocationUpdateTime
                        lastUpdateTime = tripStatus.lastUpdateTime
                        occupancyCapacity = tripStatus.occupancyCapacity
                        occupancyCount = tripStatus.occupancyCount
                        occupancyStatus = tripStatus.occupancyStatus
                        phase = tripStatus.phase
                        predicted = tripStatus.predicted
                        scheduleDeviation = tripStatus.scheduleDeviation
                        serviceDate = tripStatus.serviceDate
                        status = tripStatus.status
                        totalDistanceAlongTrip = tripStatus.totalDistanceAlongTrip
                        closestStopTimeOffset = tripStatus.closestStopTimeOffset
                        frequency = tripStatus.frequency
                        lastKnownLocation = tripStatus.lastKnownLocation
                        lastKnownOrientation = tripStatus.lastKnownOrientation
                        nextStop = tripStatus.nextStop
                        nextStopTimeOffset = tripStatus.nextStopTimeOffset
                        orientation = tripStatus.orientation
                        position = tripStatus.position
                        scheduledDistanceAlongTrip = tripStatus.scheduledDistanceAlongTrip
                        situationIds = tripStatus.situationIds.map { it.toMutableList() }
                        vehicleId = tripStatus.vehicleId
                        additionalProperties = tripStatus.additionalProperties.toMutableMap()
                    }

                    /** Trip ID of the trip the vehicle is actively serving. */
                    fun activeTripId(activeTripId: String) =
                        activeTripId(JsonField.of(activeTripId))

                    /** Trip ID of the trip the vehicle is actively serving. */
                    fun activeTripId(activeTripId: JsonField<String>) = apply {
                        this.activeTripId = activeTripId
                    }

                    /** Index of the active trip into the sequence of trips for the active block. */
                    fun blockTripSequence(blockTripSequence: Long) =
                        blockTripSequence(JsonField.of(blockTripSequence))

                    /** Index of the active trip into the sequence of trips for the active block. */
                    fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                        this.blockTripSequence = blockTripSequence
                    }

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    fun closestStop(closestStop: String) = closestStop(JsonField.of(closestStop))

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    fun closestStop(closestStop: JsonField<String>) = apply {
                        this.closestStop = closestStop
                    }

                    /**
                     * Distance, in meters, the transit vehicle has progressed along the active
                     * trip.
                     */
                    fun distanceAlongTrip(distanceAlongTrip: Double) =
                        distanceAlongTrip(JsonField.of(distanceAlongTrip))

                    /**
                     * Distance, in meters, the transit vehicle has progressed along the active
                     * trip.
                     */
                    fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                        this.distanceAlongTrip = distanceAlongTrip
                    }

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: Double) =
                        lastKnownDistanceAlongTrip(JsonField.of(lastKnownDistanceAlongTrip))

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: JsonField<Double>) =
                        apply {
                            this.lastKnownDistanceAlongTrip = lastKnownDistanceAlongTrip
                        }

                    /**
                     * Timestamp of the last known real-time location update from the transit
                     * vehicle.
                     */
                    fun lastLocationUpdateTime(lastLocationUpdateTime: Long) =
                        lastLocationUpdateTime(JsonField.of(lastLocationUpdateTime))

                    /**
                     * Timestamp of the last known real-time location update from the transit
                     * vehicle.
                     */
                    fun lastLocationUpdateTime(lastLocationUpdateTime: JsonField<Long>) = apply {
                        this.lastLocationUpdateTime = lastLocationUpdateTime
                    }

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    fun lastUpdateTime(lastUpdateTime: Long) =
                        lastUpdateTime(JsonField.of(lastUpdateTime))

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                        this.lastUpdateTime = lastUpdateTime
                    }

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    fun occupancyCapacity(occupancyCapacity: Long) =
                        occupancyCapacity(JsonField.of(occupancyCapacity))

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    fun occupancyCapacity(occupancyCapacity: JsonField<Long>) = apply {
                        this.occupancyCapacity = occupancyCapacity
                    }

                    /** Current count of occupants in the transit vehicle. */
                    fun occupancyCount(occupancyCount: Long) =
                        occupancyCount(JsonField.of(occupancyCount))

                    /** Current count of occupants in the transit vehicle. */
                    fun occupancyCount(occupancyCount: JsonField<Long>) = apply {
                        this.occupancyCount = occupancyCount
                    }

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(occupancyStatus: String) =
                        occupancyStatus(JsonField.of(occupancyStatus))

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                        this.occupancyStatus = occupancyStatus
                    }

                    /** Current journey phase of the trip. */
                    fun phase(phase: String) = phase(JsonField.of(phase))

                    /** Current journey phase of the trip. */
                    fun phase(phase: JsonField<String>) = apply { this.phase = phase }

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(predicted: JsonField<Boolean>) = apply {
                        this.predicted = predicted
                    }

                    /**
                     * Deviation from the schedule in seconds (positive for late, negative for
                     * early).
                     */
                    fun scheduleDeviation(scheduleDeviation: Long) =
                        scheduleDeviation(JsonField.of(scheduleDeviation))

                    /**
                     * Deviation from the schedule in seconds (positive for late, negative for
                     * early).
                     */
                    fun scheduleDeviation(scheduleDeviation: JsonField<Long>) = apply {
                        this.scheduleDeviation = scheduleDeviation
                    }

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    fun serviceDate(serviceDate: JsonField<Long>) = apply {
                        this.serviceDate = serviceDate
                    }

                    /** Current status modifiers for the trip. */
                    fun status(status: String) = status(JsonField.of(status))

                    /** Current status modifiers for the trip. */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /** Total length of the trip, in meters. */
                    fun totalDistanceAlongTrip(totalDistanceAlongTrip: Double) =
                        totalDistanceAlongTrip(JsonField.of(totalDistanceAlongTrip))

                    /** Total length of the trip, in meters. */
                    fun totalDistanceAlongTrip(totalDistanceAlongTrip: JsonField<Double>) = apply {
                        this.totalDistanceAlongTrip = totalDistanceAlongTrip
                    }

                    /**
                     * Time offset from the closest stop to the current position of the transit
                     * vehicle (in seconds).
                     */
                    fun closestStopTimeOffset(closestStopTimeOffset: Long) =
                        closestStopTimeOffset(JsonField.of(closestStopTimeOffset))

                    /**
                     * Time offset from the closest stop to the current position of the transit
                     * vehicle (in seconds).
                     */
                    fun closestStopTimeOffset(closestStopTimeOffset: JsonField<Long>) = apply {
                        this.closestStopTimeOffset = closestStopTimeOffset
                    }

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(frequency: JsonField<String>) = apply {
                        this.frequency = frequency
                    }

                    /** Last known location of the transit vehicle. */
                    fun lastKnownLocation(lastKnownLocation: LastKnownLocation) =
                        lastKnownLocation(JsonField.of(lastKnownLocation))

                    /** Last known location of the transit vehicle. */
                    fun lastKnownLocation(lastKnownLocation: JsonField<LastKnownLocation>) = apply {
                        this.lastKnownLocation = lastKnownLocation
                    }

                    /**
                     * Last known orientation value received in real-time from the transit vehicle.
                     */
                    fun lastKnownOrientation(lastKnownOrientation: Double) =
                        lastKnownOrientation(JsonField.of(lastKnownOrientation))

                    /**
                     * Last known orientation value received in real-time from the transit vehicle.
                     */
                    fun lastKnownOrientation(lastKnownOrientation: JsonField<Double>) = apply {
                        this.lastKnownOrientation = lastKnownOrientation
                    }

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    fun nextStop(nextStop: String) = nextStop(JsonField.of(nextStop))

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    fun nextStop(nextStop: JsonField<String>) = apply { this.nextStop = nextStop }

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    fun nextStopTimeOffset(nextStopTimeOffset: Long) =
                        nextStopTimeOffset(JsonField.of(nextStopTimeOffset))

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    fun nextStopTimeOffset(nextStopTimeOffset: JsonField<Long>) = apply {
                        this.nextStopTimeOffset = nextStopTimeOffset
                    }

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    fun orientation(orientation: Double) = orientation(JsonField.of(orientation))

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    fun orientation(orientation: JsonField<Double>) = apply {
                        this.orientation = orientation
                    }

                    /** Current position of the transit vehicle. */
                    fun position(position: Position) = position(JsonField.of(position))

                    /** Current position of the transit vehicle. */
                    fun position(position: JsonField<Position>) = apply { this.position = position }

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed
                     * along the active trip.
                     */
                    fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: Double) =
                        scheduledDistanceAlongTrip(JsonField.of(scheduledDistanceAlongTrip))

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed
                     * along the active trip.
                     */
                    fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: JsonField<Double>) =
                        apply {
                            this.scheduledDistanceAlongTrip = scheduledDistanceAlongTrip
                        }

                    /** References to situation elements (if any) applicable to this trip. */
                    fun situationIds(situationIds: kotlin.collections.List<String>) =
                        situationIds(JsonField.of(situationIds))

                    /** References to situation elements (if any) applicable to this trip. */
                    fun situationIds(situationIds: JsonField<kotlin.collections.List<String>>) =
                        apply {
                            this.situationIds = situationIds.map { it.toMutableList() }
                        }

                    /** References to situation elements (if any) applicable to this trip. */
                    fun addSituationId(situationId: String) = apply {
                        situationIds =
                            (situationIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("situationIds", it).add(situationId)
                            }
                    }

                    /** ID of the transit vehicle currently serving the trip. */
                    fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                    /** ID of the transit vehicle currently serving the trip. */
                    fun vehicleId(vehicleId: JsonField<String>) = apply {
                        this.vehicleId = vehicleId
                    }

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

                    fun build(): TripStatus =
                        TripStatus(
                            checkRequired("activeTripId", activeTripId),
                            checkRequired("blockTripSequence", blockTripSequence),
                            checkRequired("closestStop", closestStop),
                            checkRequired("distanceAlongTrip", distanceAlongTrip),
                            checkRequired("lastKnownDistanceAlongTrip", lastKnownDistanceAlongTrip),
                            checkRequired("lastLocationUpdateTime", lastLocationUpdateTime),
                            checkRequired("lastUpdateTime", lastUpdateTime),
                            checkRequired("occupancyCapacity", occupancyCapacity),
                            checkRequired("occupancyCount", occupancyCount),
                            checkRequired("occupancyStatus", occupancyStatus),
                            checkRequired("phase", phase),
                            checkRequired("predicted", predicted),
                            checkRequired("scheduleDeviation", scheduleDeviation),
                            checkRequired("serviceDate", serviceDate),
                            checkRequired("status", status),
                            checkRequired("totalDistanceAlongTrip", totalDistanceAlongTrip),
                            closestStopTimeOffset,
                            frequency,
                            lastKnownLocation,
                            lastKnownOrientation,
                            nextStop,
                            nextStopTimeOffset,
                            orientation,
                            position,
                            scheduledDistanceAlongTrip,
                            (situationIds ?: JsonMissing.of()).map { it.toImmutable() },
                            vehicleId,
                            additionalProperties.toImmutable(),
                        )
                }

                /** Last known location of the transit vehicle. */
                @NoAutoDetect
                class LastKnownLocation
                @JsonCreator
                private constructor(
                    @JsonProperty("lat")
                    @ExcludeMissing
                    private val lat: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("lon")
                    @ExcludeMissing
                    private val lon: JsonField<Double> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Latitude of the last known location of the transit vehicle. */
                    fun lat(): Double? = lat.getNullable("lat")

                    /** Longitude of the last known location of the transit vehicle. */
                    fun lon(): Double? = lon.getNullable("lon")

                    /** Latitude of the last known location of the transit vehicle. */
                    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                    /** Longitude of the last known location of the transit vehicle. */
                    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): LastKnownLocation = apply {
                        if (validated) {
                            return@apply
                        }

                        lat()
                        lon()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [LastKnownLocation].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [LastKnownLocation]. */
                    class Builder internal constructor() {

                        private var lat: JsonField<Double> = JsonMissing.of()
                        private var lon: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(lastKnownLocation: LastKnownLocation) = apply {
                            lat = lastKnownLocation.lat
                            lon = lastKnownLocation.lon
                            additionalProperties =
                                lastKnownLocation.additionalProperties.toMutableMap()
                        }

                        /** Latitude of the last known location of the transit vehicle. */
                        fun lat(lat: Double) = lat(JsonField.of(lat))

                        /** Latitude of the last known location of the transit vehicle. */
                        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                        /** Longitude of the last known location of the transit vehicle. */
                        fun lon(lon: Double) = lon(JsonField.of(lon))

                        /** Longitude of the last known location of the transit vehicle. */
                        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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

                        fun build(): LastKnownLocation =
                            LastKnownLocation(lat, lon, additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LastKnownLocation && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LastKnownLocation{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
                }

                /** Current position of the transit vehicle. */
                @NoAutoDetect
                class Position
                @JsonCreator
                private constructor(
                    @JsonProperty("lat")
                    @ExcludeMissing
                    private val lat: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("lon")
                    @ExcludeMissing
                    private val lon: JsonField<Double> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Latitude of the current position of the transit vehicle. */
                    fun lat(): Double? = lat.getNullable("lat")

                    /** Longitude of the current position of the transit vehicle. */
                    fun lon(): Double? = lon.getNullable("lon")

                    /** Latitude of the current position of the transit vehicle. */
                    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                    /** Longitude of the current position of the transit vehicle. */
                    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Position = apply {
                        if (validated) {
                            return@apply
                        }

                        lat()
                        lon()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Position]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Position]. */
                    class Builder internal constructor() {

                        private var lat: JsonField<Double> = JsonMissing.of()
                        private var lon: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(position: Position) = apply {
                            lat = position.lat
                            lon = position.lon
                            additionalProperties = position.additionalProperties.toMutableMap()
                        }

                        /** Latitude of the current position of the transit vehicle. */
                        fun lat(lat: Double) = lat(JsonField.of(lat))

                        /** Latitude of the current position of the transit vehicle. */
                        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                        /** Longitude of the current position of the transit vehicle. */
                        fun lon(lon: Double) = lon(JsonField.of(lon))

                        /** Longitude of the current position of the transit vehicle. */
                        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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

                        fun build(): Position =
                            Position(lat, lon, additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Position && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Position{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TripStatus && activeTripId == other.activeTripId && blockTripSequence == other.blockTripSequence && closestStop == other.closestStop && distanceAlongTrip == other.distanceAlongTrip && lastKnownDistanceAlongTrip == other.lastKnownDistanceAlongTrip && lastLocationUpdateTime == other.lastLocationUpdateTime && lastUpdateTime == other.lastUpdateTime && occupancyCapacity == other.occupancyCapacity && occupancyCount == other.occupancyCount && occupancyStatus == other.occupancyStatus && phase == other.phase && predicted == other.predicted && scheduleDeviation == other.scheduleDeviation && serviceDate == other.serviceDate && status == other.status && totalDistanceAlongTrip == other.totalDistanceAlongTrip && closestStopTimeOffset == other.closestStopTimeOffset && frequency == other.frequency && lastKnownLocation == other.lastKnownLocation && lastKnownOrientation == other.lastKnownOrientation && nextStop == other.nextStop && nextStopTimeOffset == other.nextStopTimeOffset && orientation == other.orientation && position == other.position && scheduledDistanceAlongTrip == other.scheduledDistanceAlongTrip && situationIds == other.situationIds && vehicleId == other.vehicleId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(activeTripId, blockTripSequence, closestStop, distanceAlongTrip, lastKnownDistanceAlongTrip, lastLocationUpdateTime, lastUpdateTime, occupancyCapacity, occupancyCount, occupancyStatus, phase, predicted, scheduleDeviation, serviceDate, status, totalDistanceAlongTrip, closestStopTimeOffset, frequency, lastKnownLocation, lastKnownOrientation, nextStop, nextStopTimeOffset, orientation, position, scheduledDistanceAlongTrip, situationIds, vehicleId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TripStatus{activeTripId=$activeTripId, blockTripSequence=$blockTripSequence, closestStop=$closestStop, distanceAlongTrip=$distanceAlongTrip, lastKnownDistanceAlongTrip=$lastKnownDistanceAlongTrip, lastLocationUpdateTime=$lastLocationUpdateTime, lastUpdateTime=$lastUpdateTime, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, phase=$phase, predicted=$predicted, scheduleDeviation=$scheduleDeviation, serviceDate=$serviceDate, status=$status, totalDistanceAlongTrip=$totalDistanceAlongTrip, closestStopTimeOffset=$closestStopTimeOffset, frequency=$frequency, lastKnownLocation=$lastKnownLocation, lastKnownOrientation=$lastKnownOrientation, nextStop=$nextStop, nextStopTimeOffset=$nextStopTimeOffset, orientation=$orientation, position=$position, scheduledDistanceAlongTrip=$scheduledDistanceAlongTrip, situationIds=$situationIds, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is List && lastLocationUpdateTime == other.lastLocationUpdateTime && lastUpdateTime == other.lastUpdateTime && location == other.location && tripId == other.tripId && tripStatus == other.tripStatus && vehicleId == other.vehicleId && occupancyCapacity == other.occupancyCapacity && occupancyCount == other.occupancyCount && occupancyStatus == other.occupancyStatus && phase == other.phase && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lastLocationUpdateTime, lastUpdateTime, location, tripId, tripStatus, vehicleId, occupancyCapacity, occupancyCount, occupancyStatus, phase, status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "List{lastLocationUpdateTime=$lastLocationUpdateTime, lastUpdateTime=$lastUpdateTime, location=$location, tripId=$tripId, tripStatus=$tripStatus, vehicleId=$vehicleId, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, phase=$phase, status=$status, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && limitExceeded == other.limitExceeded && list == other.list && references == other.references && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(limitExceeded, list, references, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{limitExceeded=$limitExceeded, list=$list, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VehiclesForAgencyListResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VehiclesForAgencyListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}

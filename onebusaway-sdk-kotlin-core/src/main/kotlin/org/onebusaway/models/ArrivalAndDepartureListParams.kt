// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.Params
import org.onebusaway.core.checkRequired
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** arrivals-and-departures-for-stop */
class ArrivalAndDepartureListParams
private constructor(
    private val stopId: String,
    private val minutesAfter: Long?,
    private val minutesBefore: Long?,
    private val time: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun stopId(): String = stopId

    /** Include vehicles arriving or departing in the next n minutes. */
    fun minutesAfter(): Long? = minutesAfter

    /** Include vehicles having arrived or departed in the previous n minutes. */
    fun minutesBefore(): Long? = minutesBefore

    /** The specific time for querying the system status. */
    fun time(): OffsetDateTime? = time

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                minutesAfter?.let { put("minutesAfter", it.toString()) }
                minutesBefore?.let { put("minutesBefore", it.toString()) }
                time?.let { put("time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> stopId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ArrivalAndDepartureListParams].
         *
         * The following fields are required:
         * ```kotlin
         * .stopId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ArrivalAndDepartureListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var stopId: String? = null
        private var minutesAfter: Long? = null
        private var minutesBefore: Long? = null
        private var time: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(arrivalAndDepartureListParams: ArrivalAndDepartureListParams) = apply {
            stopId = arrivalAndDepartureListParams.stopId
            minutesAfter = arrivalAndDepartureListParams.minutesAfter
            minutesBefore = arrivalAndDepartureListParams.minutesBefore
            time = arrivalAndDepartureListParams.time
            additionalHeaders = arrivalAndDepartureListParams.additionalHeaders.toBuilder()
            additionalQueryParams = arrivalAndDepartureListParams.additionalQueryParams.toBuilder()
        }

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        /** Include vehicles arriving or departing in the next n minutes. */
        fun minutesAfter(minutesAfter: Long?) = apply { this.minutesAfter = minutesAfter }

        /**
         * Alias for [Builder.minutesAfter].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minutesAfter(minutesAfter: Long) = minutesAfter(minutesAfter as Long?)

        /** Include vehicles having arrived or departed in the previous n minutes. */
        fun minutesBefore(minutesBefore: Long?) = apply { this.minutesBefore = minutesBefore }

        /**
         * Alias for [Builder.minutesBefore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minutesBefore(minutesBefore: Long) = minutesBefore(minutesBefore as Long?)

        /** The specific time for querying the system status. */
        fun time(time: OffsetDateTime?) = apply { this.time = time }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ArrivalAndDepartureListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .stopId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ArrivalAndDepartureListParams =
            ArrivalAndDepartureListParams(
                checkRequired("stopId", stopId),
                minutesAfter,
                minutesBefore,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ArrivalAndDepartureListParams && stopId == other.stopId && minutesAfter == other.minutesAfter && minutesBefore == other.minutesBefore && time == other.time && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(stopId, minutesAfter, minutesBefore, time, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ArrivalAndDepartureListParams{stopId=$stopId, minutesAfter=$minutesAfter, minutesBefore=$minutesBefore, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.Params
import org.onebusaway.core.checkRequired
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** Search for active trips for a specific route. */
class TripsForRouteListParams
private constructor(
    private val routeId: String,
    private val includeSchedule: Boolean?,
    private val includeStatus: Boolean?,
    private val time: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun routeId(): String = routeId

    /** Determine whether full schedule elements are included. Defaults to false. */
    fun includeSchedule(): Boolean? = includeSchedule

    /**
     * Determine whether full tripStatus elements with real-time information are included. Defaults
     * to false.
     */
    fun includeStatus(): Boolean? = includeStatus

    /** Query the system at a specific time. Useful for testing. */
    fun time(): Long? = time

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.includeSchedule?.let { queryParams.put("includeSchedule", listOf(it.toString())) }
        this.includeStatus?.let { queryParams.put("includeStatus", listOf(it.toString())) }
        this.time?.let { queryParams.put("time", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> routeId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TripsForRouteListParams].
         *
         * The following fields are required:
         * ```kotlin
         * .routeId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TripsForRouteListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var routeId: String? = null
        private var includeSchedule: Boolean? = null
        private var includeStatus: Boolean? = null
        private var time: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(tripsForRouteListParams: TripsForRouteListParams) = apply {
            routeId = tripsForRouteListParams.routeId
            includeSchedule = tripsForRouteListParams.includeSchedule
            includeStatus = tripsForRouteListParams.includeStatus
            time = tripsForRouteListParams.time
            additionalHeaders = tripsForRouteListParams.additionalHeaders.toBuilder()
            additionalQueryParams = tripsForRouteListParams.additionalQueryParams.toBuilder()
        }

        fun routeId(routeId: String) = apply { this.routeId = routeId }

        /** Determine whether full schedule elements are included. Defaults to false. */
        fun includeSchedule(includeSchedule: Boolean?) = apply {
            this.includeSchedule = includeSchedule
        }

        /** Determine whether full schedule elements are included. Defaults to false. */
        fun includeSchedule(includeSchedule: Boolean) = includeSchedule(includeSchedule as Boolean?)

        /**
         * Determine whether full tripStatus elements with real-time information are included.
         * Defaults to false.
         */
        fun includeStatus(includeStatus: Boolean?) = apply { this.includeStatus = includeStatus }

        /**
         * Determine whether full tripStatus elements with real-time information are included.
         * Defaults to false.
         */
        fun includeStatus(includeStatus: Boolean) = includeStatus(includeStatus as Boolean?)

        /** Query the system at a specific time. Useful for testing. */
        fun time(time: Long?) = apply { this.time = time }

        /** Query the system at a specific time. Useful for testing. */
        fun time(time: Long) = time(time as Long?)

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

        fun build(): TripsForRouteListParams =
            TripsForRouteListParams(
                checkRequired("routeId", routeId),
                includeSchedule,
                includeStatus,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TripsForRouteListParams && routeId == other.routeId && includeSchedule == other.includeSchedule && includeStatus == other.includeStatus && time == other.time && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routeId, includeSchedule, includeStatus, time, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TripsForRouteListParams{routeId=$routeId, includeSchedule=$includeSchedule, includeStatus=$includeStatus, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toUnmodifiable
import org.onebusaway.models.*

class RoutesForLocationListParams
constructor(
    private val lat: Double,
    private val lon: Double,
    private val latSpan: Double?,
    private val lonSpan: Double?,
    private val query: String?,
    private val radius: Double?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun lat(): Double = lat

    fun lon(): Double = lon

    fun latSpan(): Double? = latSpan

    fun lonSpan(): Double? = lonSpan

    fun query(): String? = query

    fun radius(): Double? = radius

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.lat.let { params.put("lat", listOf(it.toString())) }
        this.lon.let { params.put("lon", listOf(it.toString())) }
        this.latSpan?.let { params.put("latSpan", listOf(it.toString())) }
        this.lonSpan?.let { params.put("lonSpan", listOf(it.toString())) }
        this.query?.let { params.put("query", listOf(it.toString())) }
        this.radius?.let { params.put("radius", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutesForLocationListParams && this.lat == other.lat && this.lon == other.lon && this.latSpan == other.latSpan && this.lonSpan == other.lonSpan && this.query == other.query && this.radius == other.radius && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(lat, lon, latSpan, lonSpan, query, radius, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "RoutesForLocationListParams{lat=$lat, lon=$lon, latSpan=$latSpan, lonSpan=$lonSpan, query=$query, radius=$radius, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var lat: Double? = null
        private var lon: Double? = null
        private var latSpan: Double? = null
        private var lonSpan: Double? = null
        private var query: String? = null
        private var radius: Double? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(routesForLocationListParams: RoutesForLocationListParams) = apply {
            this.lat = routesForLocationListParams.lat
            this.lon = routesForLocationListParams.lon
            this.latSpan = routesForLocationListParams.latSpan
            this.lonSpan = routesForLocationListParams.lonSpan
            this.query = routesForLocationListParams.query
            this.radius = routesForLocationListParams.radius
            additionalQueryParams(routesForLocationListParams.additionalQueryParams)
            additionalHeaders(routesForLocationListParams.additionalHeaders)
        }

        fun lat(lat: Double) = apply { this.lat = lat }

        fun lon(lon: Double) = apply { this.lon = lon }

        fun latSpan(latSpan: Double) = apply { this.latSpan = latSpan }

        fun lonSpan(lonSpan: Double) = apply { this.lonSpan = lonSpan }

        fun query(query: String) = apply { this.query = query }

        fun radius(radius: Double) = apply { this.radius = radius }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): RoutesForLocationListParams =
            RoutesForLocationListParams(
                checkNotNull(lat) { "`lat` is required but was not set" },
                checkNotNull(lon) { "`lon` is required but was not set" },
                latSpan,
                lonSpan,
                query,
                radius,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}

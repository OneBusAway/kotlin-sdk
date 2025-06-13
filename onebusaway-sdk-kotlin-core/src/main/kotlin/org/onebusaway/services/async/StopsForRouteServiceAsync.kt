// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopsforroute.StopsForRouteListParams
import org.onebusaway.models.stopsforroute.StopsForRouteListResponse

interface StopsForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StopsForRouteServiceAsync

    /** Get stops for a specific route */
    suspend fun list(
        routeId: String,
        params: StopsForRouteListParams = StopsForRouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForRouteListResponse = list(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: StopsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForRouteListResponse

    /** @see [list] */
    suspend fun list(routeId: String, requestOptions: RequestOptions): StopsForRouteListResponse =
        list(routeId, StopsForRouteListParams.none(), requestOptions)

    /**
     * A view of [StopsForRouteServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StopsForRouteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-route/{routeID}.json`, but is
         * otherwise the same as [StopsForRouteServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            routeId: String,
            params: StopsForRouteListParams = StopsForRouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForRouteListResponse> =
            list(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: StopsForRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForRouteListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            routeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopsForRouteListResponse> =
            list(routeId, StopsForRouteListParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripsforroute.TripsForRouteListParams
import org.onebusaway.models.tripsforroute.TripsForRouteListResponse

interface TripsForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TripsForRouteServiceAsync

    /** Search for active trips for a specific route. */
    suspend fun list(
        routeId: String,
        params: TripsForRouteListParams = TripsForRouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripsForRouteListResponse = list(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripsForRouteListResponse

    /** @see [list] */
    suspend fun list(routeId: String, requestOptions: RequestOptions): TripsForRouteListResponse =
        list(routeId, TripsForRouteListParams.none(), requestOptions)

    /**
     * A view of [TripsForRouteServiceAsync] that provides access to raw HTTP responses for each
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
        ): TripsForRouteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trips-for-route/{routeID}.json`, but is
         * otherwise the same as [TripsForRouteServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            routeId: String,
            params: TripsForRouteListParams = TripsForRouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripsForRouteListResponse> =
            list(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: TripsForRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripsForRouteListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            routeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripsForRouteListResponse> =
            list(routeId, TripsForRouteListParams.none(), requestOptions)
    }
}

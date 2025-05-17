// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.route.RouteRetrieveParams
import org.onebusaway.models.route.RouteRetrieveResponse

interface RouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve information for a specific route identified by its unique ID. */
    suspend fun retrieve(
        routeId: String,
        params: RouteRetrieveParams = RouteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteRetrieveResponse = retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(routeId: String, requestOptions: RequestOptions): RouteRetrieveResponse =
        retrieve(routeId, RouteRetrieveParams.none(), requestOptions)

    /** A view of [RouteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/route/{routeID}.json`, but is otherwise
         * the same as [RouteServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            routeId: String,
            params: RouteRetrieveParams = RouteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteRetrieveResponse> =
            retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: RouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            routeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RouteRetrieveResponse> =
            retrieve(routeId, RouteRetrieveParams.none(), requestOptions)
    }
}

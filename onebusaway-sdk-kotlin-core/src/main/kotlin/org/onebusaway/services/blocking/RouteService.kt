// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.route.RouteRetrieveParams
import org.onebusaway.models.route.RouteRetrieveResponse

interface RouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RouteService

    /** Retrieve information for a specific route identified by its unique ID. */
    fun retrieve(
        routeId: String,
        params: RouteRetrieveParams = RouteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteRetrieveResponse = retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(routeId: String, requestOptions: RequestOptions): RouteRetrieveResponse =
        retrieve(routeId, RouteRetrieveParams.none(), requestOptions)

    /** A view of [RouteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RouteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/route/{routeID}.json`, but is otherwise
         * the same as [RouteService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            params: RouteRetrieveParams = RouteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteRetrieveResponse> =
            retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RouteRetrieveResponse> =
            retrieve(routeId, RouteRetrieveParams.none(), requestOptions)
    }
}

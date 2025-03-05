// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.RouteRetrieveParams
import org.onebusaway.models.RouteRetrieveResponse

interface RouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve information for a specific route identified by its unique ID. */
    fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteRetrieveResponse

    /** A view of [RouteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/route/{routeID}.json`, but is otherwise
         * the same as [RouteService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: RouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteRetrieveResponse>
    }
}

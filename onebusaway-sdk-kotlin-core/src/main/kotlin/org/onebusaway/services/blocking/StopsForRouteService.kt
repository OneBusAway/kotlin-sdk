// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.StopsForRouteListParams
import org.onebusaway.models.StopsForRouteListResponse

interface StopsForRouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get stops for a specific route */
    fun list(params: StopsForRouteListParams, requestOptions: RequestOptions = RequestOptions.none()): StopsForRouteListResponse

    /**
     * A view of [StopsForRouteService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-route/{routeID}.json`,
         * but is otherwise the same as [StopsForRouteService.list].
         */
        @MustBeClosed
        fun list(params: StopsForRouteListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StopsForRouteListResponse>
    }
}

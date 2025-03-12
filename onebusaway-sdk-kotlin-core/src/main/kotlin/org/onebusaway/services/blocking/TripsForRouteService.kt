// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.TripsForRouteListParams
import org.onebusaway.models.TripsForRouteListResponse

interface TripsForRouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Search for active trips for a specific route. */
    fun list(params: TripsForRouteListParams, requestOptions: RequestOptions = RequestOptions.none()): TripsForRouteListResponse

    /**
     * A view of [TripsForRouteService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trips-for-route/{routeID}.json`,
         * but is otherwise the same as [TripsForRouteService.list].
         */
        @MustBeClosed
        fun list(params: TripsForRouteListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TripsForRouteListResponse>
    }
}

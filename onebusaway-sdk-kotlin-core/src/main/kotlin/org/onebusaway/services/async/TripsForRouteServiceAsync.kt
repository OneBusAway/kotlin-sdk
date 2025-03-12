// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.TripsForRouteListParams
import org.onebusaway.models.TripsForRouteListResponse

interface TripsForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Search for active trips for a specific route. */
    suspend fun list(params: TripsForRouteListParams, requestOptions: RequestOptions = RequestOptions.none()): TripsForRouteListResponse

    /**
     * A view of [TripsForRouteServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trips-for-route/{routeID}.json`,
         * but is otherwise the same as [TripsForRouteServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: TripsForRouteListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<TripsForRouteListResponse>
    }
}

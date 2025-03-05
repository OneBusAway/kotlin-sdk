// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ScheduleForRouteRetrieveParams
import org.onebusaway.models.ScheduleForRouteRetrieveResponse

interface ScheduleForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the full schedule for a route on a particular day */
    suspend fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForRouteRetrieveResponse

    /**
     * A view of [ScheduleForRouteServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/schedule-for-route/{routeID}.json`, but
         * is otherwise the same as [ScheduleForRouteServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ScheduleForRouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForRouteRetrieveResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ScheduleForStopRetrieveParams
import org.onebusaway.models.ScheduleForStopRetrieveResponse

interface ScheduleForStopService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get schedule for a specific stop */
    fun retrieve(params: ScheduleForStopRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): ScheduleForStopRetrieveResponse

    /**
     * A view of [ScheduleForStopService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /api/where/schedule-for-stop/{stopID}.json`, but is otherwise the same as
         * [ScheduleForStopService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ScheduleForStopRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ScheduleForStopRetrieveResponse>
    }
}

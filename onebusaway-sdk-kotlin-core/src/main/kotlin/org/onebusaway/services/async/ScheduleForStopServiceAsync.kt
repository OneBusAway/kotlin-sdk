// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.scheduleforstop.ScheduleForStopRetrieveParams
import org.onebusaway.models.scheduleforstop.ScheduleForStopRetrieveResponse

interface ScheduleForStopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get schedule for a specific stop */
    suspend fun retrieve(
        stopId: String,
        params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForStopRetrieveResponse =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ScheduleForStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForStopRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        stopId: String,
        requestOptions: RequestOptions,
    ): ScheduleForStopRetrieveResponse =
        retrieve(stopId, ScheduleForStopRetrieveParams.none(), requestOptions)

    /**
     * A view of [ScheduleForStopServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/schedule-for-stop/{stopID}.json`, but is
         * otherwise the same as [ScheduleForStopServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            stopId: String,
            params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForStopRetrieveResponse> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ScheduleForStopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForStopRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleForStopRetrieveResponse> =
            retrieve(stopId, ScheduleForStopRetrieveParams.none(), requestOptions)
    }
}

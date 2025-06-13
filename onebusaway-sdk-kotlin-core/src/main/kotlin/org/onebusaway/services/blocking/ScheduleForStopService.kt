// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.scheduleforstop.ScheduleForStopRetrieveParams
import org.onebusaway.models.scheduleforstop.ScheduleForStopRetrieveResponse

interface ScheduleForStopService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScheduleForStopService

    /** Get schedule for a specific stop */
    fun retrieve(
        stopId: String,
        params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForStopRetrieveResponse =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduleForStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForStopRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(stopId: String, requestOptions: RequestOptions): ScheduleForStopRetrieveResponse =
        retrieve(stopId, ScheduleForStopRetrieveParams.none(), requestOptions)

    /**
     * A view of [ScheduleForStopService] that provides access to raw HTTP responses for each
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
        ): ScheduleForStopService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/schedule-for-stop/{stopID}.json`, but is
         * otherwise the same as [ScheduleForStopService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForStopRetrieveResponse> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduleForStopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForStopRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleForStopRetrieveResponse> =
            retrieve(stopId, ScheduleForStopRetrieveParams.none(), requestOptions)
    }
}

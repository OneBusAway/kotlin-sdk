// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveParams
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveResponse

interface ScheduleForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScheduleForRouteServiceAsync

    /** Retrieve the full schedule for a route on a particular day */
    suspend fun retrieve(
        routeId: String,
        params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForRouteRetrieveResponse =
        retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForRouteRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        routeId: String,
        requestOptions: RequestOptions,
    ): ScheduleForRouteRetrieveResponse =
        retrieve(routeId, ScheduleForRouteRetrieveParams.none(), requestOptions)

    /**
     * A view of [ScheduleForRouteServiceAsync] that provides access to raw HTTP responses for each
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
        ): ScheduleForRouteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/schedule-for-route/{routeID}.json`, but
         * is otherwise the same as [ScheduleForRouteServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            routeId: String,
            params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForRouteRetrieveResponse> =
            retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ScheduleForRouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForRouteRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            routeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleForRouteRetrieveResponse> =
            retrieve(routeId, ScheduleForRouteRetrieveParams.none(), requestOptions)
    }
}

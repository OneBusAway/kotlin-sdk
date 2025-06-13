// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureListParams
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureListResponse
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureRetrieveParams
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ArrivalAndDepartureServiceAsync

    /** arrival-and-departure-for-stop */
    suspend fun retrieve(
        stopId: String,
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalAndDepartureRetrieveResponse =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalAndDepartureRetrieveResponse

    /** arrivals-and-departures-for-stop */
    suspend fun list(
        stopId: String,
        params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalAndDepartureListResponse =
        list(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: ArrivalAndDepartureListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalAndDepartureListResponse

    /** @see [list] */
    suspend fun list(
        stopId: String,
        requestOptions: RequestOptions,
    ): ArrivalAndDepartureListResponse =
        list(stopId, ArrivalAndDepartureListParams.none(), requestOptions)

    /**
     * A view of [ArrivalAndDepartureServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ArrivalAndDepartureServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/where/arrival-and-departure-for-stop/{stopID}.json`, but is otherwise the same as
         * [ArrivalAndDepartureServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            stopId: String,
            params: ArrivalAndDepartureRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalAndDepartureRetrieveResponse> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ArrivalAndDepartureRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalAndDepartureRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get
         * /api/where/arrivals-and-departures-for-stop/{stopID}.json`, but is otherwise the same as
         * [ArrivalAndDepartureServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            stopId: String,
            params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalAndDepartureListResponse> =
            list(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: ArrivalAndDepartureListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalAndDepartureListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            stopId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArrivalAndDepartureListResponse> =
            list(stopId, ArrivalAndDepartureListParams.none(), requestOptions)
    }
}

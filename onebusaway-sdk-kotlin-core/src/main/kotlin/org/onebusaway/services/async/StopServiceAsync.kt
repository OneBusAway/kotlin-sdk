// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stop.StopRetrieveParams
import org.onebusaway.models.stop.StopRetrieveResponse

interface StopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details of a specific stop */
    suspend fun retrieve(
        stopId: String,
        params: StopRetrieveParams = StopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopRetrieveResponse = retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(stopId: String, requestOptions: RequestOptions): StopRetrieveResponse =
        retrieve(stopId, StopRetrieveParams.none(), requestOptions)

    /** A view of [StopServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/stop/{stopID}.json`, but is otherwise the
         * same as [StopServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            stopId: String,
            params: StopRetrieveParams = StopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopRetrieveResponse> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: StopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopRetrieveResponse> =
            retrieve(stopId, StopRetrieveParams.none(), requestOptions)
    }
}

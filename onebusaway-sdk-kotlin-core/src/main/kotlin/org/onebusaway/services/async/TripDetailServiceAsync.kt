// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripdetails.TripDetailRetrieveParams
import org.onebusaway.models.tripdetails.TripDetailRetrieveResponse

interface TripDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TripDetailServiceAsync

    /** Retrieve Trip Details */
    suspend fun retrieve(
        tripId: String,
        params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripDetailRetrieveResponse =
        retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripDetailRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        tripId: String,
        requestOptions: RequestOptions,
    ): TripDetailRetrieveResponse =
        retrieve(tripId, TripDetailRetrieveParams.none(), requestOptions)

    /**
     * A view of [TripDetailServiceAsync] that provides access to raw HTTP responses for each
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
        ): TripDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trip-details/{tripID}.json`, but is
         * otherwise the same as [TripDetailServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            tripId: String,
            params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripDetailRetrieveResponse> =
            retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: TripDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripDetailRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            tripId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripDetailRetrieveResponse> =
            retrieve(tripId, TripDetailRetrieveParams.none(), requestOptions)
    }
}

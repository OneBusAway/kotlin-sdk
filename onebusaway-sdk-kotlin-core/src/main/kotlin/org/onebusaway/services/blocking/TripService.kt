// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.trip.TripRetrieveParams
import org.onebusaway.models.trip.TripRetrieveResponse

interface TripService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TripService

    /** Get details of a specific trip */
    fun retrieve(
        tripId: String,
        params: TripRetrieveParams = TripRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripRetrieveResponse = retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(tripId: String, requestOptions: RequestOptions): TripRetrieveResponse =
        retrieve(tripId, TripRetrieveParams.none(), requestOptions)

    /** A view of [TripService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TripService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trip/{tripID}.json`, but is otherwise the
         * same as [TripService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: TripRetrieveParams = TripRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripRetrieveResponse> =
            retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripRetrieveResponse> =
            retrieve(tripId, TripRetrieveParams.none(), requestOptions)
    }
}

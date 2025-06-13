// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveParams
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveResponse

interface TripForVehicleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TripForVehicleServiceAsync

    /** Retrieve trip for a specific vehicle */
    suspend fun retrieve(
        vehicleId: String,
        params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripForVehicleRetrieveResponse =
        retrieve(params.toBuilder().vehicleId(vehicleId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripForVehicleRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        vehicleId: String,
        requestOptions: RequestOptions,
    ): TripForVehicleRetrieveResponse =
        retrieve(vehicleId, TripForVehicleRetrieveParams.none(), requestOptions)

    /**
     * A view of [TripForVehicleServiceAsync] that provides access to raw HTTP responses for each
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
        ): TripForVehicleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trip-for-vehicle/{vehicleID}.json`, but
         * is otherwise the same as [TripForVehicleServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            vehicleId: String,
            params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripForVehicleRetrieveResponse> =
            retrieve(params.toBuilder().vehicleId(vehicleId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: TripForVehicleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripForVehicleRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            vehicleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripForVehicleRetrieveResponse> =
            retrieve(vehicleId, TripForVehicleRetrieveParams.none(), requestOptions)
    }
}

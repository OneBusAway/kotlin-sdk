// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.TripForVehicleRetrieveParams
import org.onebusaway.models.TripForVehicleRetrieveResponse

interface TripForVehicleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve trip for a specific vehicle */
    suspend fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripForVehicleRetrieveResponse

    /**
     * A view of [TripForVehicleServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trip-for-vehicle/{vehicleID}.json`, but
         * is otherwise the same as [TripForVehicleServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: TripForVehicleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripForVehicleRetrieveResponse>
    }
}

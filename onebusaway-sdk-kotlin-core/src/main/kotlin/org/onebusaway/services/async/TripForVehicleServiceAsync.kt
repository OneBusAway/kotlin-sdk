// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripForVehicleRetrieveParams
import org.onebusaway.models.TripForVehicleRetrieveResponse

interface TripForVehicleServiceAsync {

    /** Retrieve trip for a specific vehicle */
    suspend fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripForVehicleRetrieveResponse
}

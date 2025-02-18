// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripForVehicleRetrieveParams
import org.onebusaway.models.TripForVehicleRetrieveResponse

interface TripForVehicleService {

    /** Retrieve trip for a specific vehicle */
    fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripForVehicleRetrieveResponse
}

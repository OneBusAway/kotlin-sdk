// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripsForLocationListParams
import org.onebusaway.models.TripsForLocationListResponse

interface TripsForLocationService {

    /** Retrieve trips for a given location */
    fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripsForLocationListResponse
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripsForRouteListParams
import org.onebusaway.models.TripsForRouteListResponse

interface TripsForRouteService {

    /** Search for active trips for a specific route. */
    fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripsForRouteListResponse
}

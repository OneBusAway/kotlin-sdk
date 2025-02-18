// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopsForRouteListParams
import org.onebusaway.models.StopsForRouteListResponse

interface StopsForRouteService {

    /** Get stops for a specific route */
    fun list(
        params: StopsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForRouteListResponse
}

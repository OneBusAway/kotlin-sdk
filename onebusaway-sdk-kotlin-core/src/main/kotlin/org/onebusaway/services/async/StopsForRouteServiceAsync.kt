// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopsForRouteListParams
import org.onebusaway.models.StopsForRouteListResponse

interface StopsForRouteServiceAsync {

    /** Get stops for a specific route */
    suspend fun list(
        params: StopsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopsForRouteListResponse
}

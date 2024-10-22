// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopsForLocationListParams
import org.onebusaway.models.StopsForLocationListResponse

interface StopsForLocationService {

    /** stops-for-location */
    fun list(
        params: StopsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopsForLocationListResponse
}

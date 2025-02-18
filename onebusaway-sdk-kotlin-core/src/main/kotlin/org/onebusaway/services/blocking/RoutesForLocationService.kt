// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.RoutesForLocationListParams
import org.onebusaway.models.RoutesForLocationListResponse

interface RoutesForLocationService {

    /** routes-for-location */
    fun list(
        params: RoutesForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForLocationListResponse
}

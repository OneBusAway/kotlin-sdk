// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopsForAgencyListParams
import org.onebusaway.models.StopsForAgencyListResponse

interface StopsForAgencyService {

    /** Get stops for a specific agency */
    fun list(
        params: StopsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopsForAgencyListResponse
}

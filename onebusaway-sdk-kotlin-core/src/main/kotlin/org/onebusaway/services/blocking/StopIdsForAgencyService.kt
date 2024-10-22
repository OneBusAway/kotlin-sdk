// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopIdsForAgencyListParams
import org.onebusaway.models.StopIdsForAgencyListResponse

interface StopIdsForAgencyService {

    /** Get stop IDs for a specific agency */
    fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopIdsForAgencyListResponse
}

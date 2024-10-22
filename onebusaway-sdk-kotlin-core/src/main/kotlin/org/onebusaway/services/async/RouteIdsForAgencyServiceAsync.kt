// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.RouteIdsForAgencyListParams
import org.onebusaway.models.RouteIdsForAgencyListResponse

interface RouteIdsForAgencyServiceAsync {

    /** Get route IDs for a specific agency */
    suspend fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteIdsForAgencyListResponse
}

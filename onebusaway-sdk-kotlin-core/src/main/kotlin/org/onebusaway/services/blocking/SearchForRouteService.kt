// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.SearchForRouteListParams
import org.onebusaway.models.SearchForRouteListResponse

interface SearchForRouteService {

    /** Search for a route based on its name. */
    fun list(
        params: SearchForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchForRouteListResponse
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.SearchForStopListParams
import org.onebusaway.models.SearchForStopListResponse

interface SearchForStopService {

    /** Search for a stop based on its name. */
    fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchForStopListResponse
}

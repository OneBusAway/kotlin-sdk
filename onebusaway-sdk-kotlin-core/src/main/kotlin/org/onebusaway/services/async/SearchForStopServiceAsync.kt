// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.SearchForStopListParams
import org.onebusaway.models.SearchForStopListResponse

interface SearchForStopServiceAsync {

    /** Search for a stop based on its name. */
    suspend fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchForStopListResponse
}

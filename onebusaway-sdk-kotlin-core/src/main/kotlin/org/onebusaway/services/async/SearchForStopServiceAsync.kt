// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.SearchForStopListParams
import org.onebusaway.models.SearchForStopListResponse

interface SearchForStopServiceAsync {

    /** Search for a stop based on its name. */
    suspend fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SearchForStopListResponse
}

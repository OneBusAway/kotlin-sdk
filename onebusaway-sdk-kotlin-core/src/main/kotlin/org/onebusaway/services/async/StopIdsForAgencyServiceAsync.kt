// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopIdsForAgencyListParams
import org.onebusaway.models.StopIdsForAgencyListResponse

interface StopIdsForAgencyServiceAsync {

    /** Get stop IDs for a specific agency */
    suspend fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopIdsForAgencyListResponse
}

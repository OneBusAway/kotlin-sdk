// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopsForLocationListParams
import org.onebusaway.models.StopsForLocationListResponse

interface StopsForLocationServiceAsync {

    /** stops-for-location */
    suspend fun list(
        params: StopsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopsForLocationListResponse
}

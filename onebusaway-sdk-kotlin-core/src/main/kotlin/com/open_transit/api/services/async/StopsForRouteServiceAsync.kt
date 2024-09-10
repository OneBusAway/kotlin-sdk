// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.StopsForRouteListParams
import com.open_transit.api.models.StopsForRouteListResponse

interface StopsForRouteServiceAsync {

    /** Get stops for a specific route */
    suspend fun list(
        params: StopsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopsForRouteListResponse
}

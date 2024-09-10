// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.CurrentTimeRetrieveParams
import com.open_transit.api.models.CurrentTimeRetrieveResponse

interface CurrentTimeServiceAsync {

    /** current-time */
    suspend fun retrieve(
        params: CurrentTimeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CurrentTimeRetrieveResponse
}

// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.VehiclesForAgencyListParams
import com.open_transit.api.models.VehiclesForAgencyListResponse

interface VehiclesForAgencyServiceAsync {

    /** Get vehicles for a specific agency */
    suspend fun list(
        params: VehiclesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VehiclesForAgencyListResponse
}

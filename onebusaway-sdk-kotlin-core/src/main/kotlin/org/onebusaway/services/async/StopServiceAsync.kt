// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopRetrieveParams
import org.onebusaway.models.StopRetrieveResponse

interface StopServiceAsync {

    /** Get details of a specific stop */
    suspend fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopRetrieveResponse
}

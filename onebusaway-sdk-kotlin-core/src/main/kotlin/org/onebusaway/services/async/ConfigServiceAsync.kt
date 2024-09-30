// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ConfigRetrieveParams
import org.onebusaway.models.ConfigRetrieveResponse

interface ConfigServiceAsync {

    /** config */
    suspend fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConfigRetrieveResponse
}

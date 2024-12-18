// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopRetrieveParams
import org.onebusaway.models.StopRetrieveResponse

interface StopService {

    /** Get details of a specific stop */
    fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopRetrieveResponse
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.CurrentTimeRetrieveParams
import org.onebusaway.models.CurrentTimeRetrieveResponse

interface CurrentTimeServiceAsync {

    /** current-time */
    suspend fun retrieve(
        params: CurrentTimeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentTimeRetrieveResponse
}

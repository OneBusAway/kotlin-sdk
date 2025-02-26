// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.CurrentTimeRetrieveParams
import org.onebusaway.models.CurrentTimeRetrieveResponse

interface CurrentTimeServiceAsync {

    /** current-time */
    suspend fun retrieve(
        params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentTimeRetrieveResponse

    /** current-time */
    suspend fun retrieve(requestOptions: RequestOptions): CurrentTimeRetrieveResponse =
        retrieve(CurrentTimeRetrieveParams.none(), requestOptions)
}

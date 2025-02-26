// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.CurrentTimeRetrieveParams
import org.onebusaway.models.CurrentTimeRetrieveResponse

interface CurrentTimeService {

    /** current-time */
    fun retrieve(
        params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentTimeRetrieveResponse

    /** current-time */
    fun retrieve(requestOptions: RequestOptions): CurrentTimeRetrieveResponse =
        retrieve(CurrentTimeRetrieveParams.none(), requestOptions)
}

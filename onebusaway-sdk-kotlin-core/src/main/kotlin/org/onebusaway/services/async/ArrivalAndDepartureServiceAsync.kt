// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ArrivalAndDepartureListParams
import org.onebusaway.models.ArrivalAndDepartureListResponse
import org.onebusaway.models.ArrivalAndDepartureRetrieveParams
import org.onebusaway.models.ArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureServiceAsync {

    /** arrival-and-departure-for-stop */
    suspend fun retrieve(
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ArrivalAndDepartureRetrieveResponse

    /** arrivals-and-departures-for-stop */
    suspend fun list(
        params: ArrivalAndDepartureListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ArrivalAndDepartureListResponse
}

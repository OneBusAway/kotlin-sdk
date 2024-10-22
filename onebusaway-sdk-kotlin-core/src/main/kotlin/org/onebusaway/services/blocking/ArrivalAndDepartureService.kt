// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ArrivalAndDepartureListParams
import org.onebusaway.models.ArrivalAndDepartureListResponse
import org.onebusaway.models.ArrivalAndDepartureRetrieveParams
import org.onebusaway.models.ArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureService {

    /** arrival-and-departure-for-stop */
    fun retrieve(
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ArrivalAndDepartureRetrieveResponse

    /** arrivals-and-departures-for-stop */
    fun list(
        params: ArrivalAndDepartureListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ArrivalAndDepartureListResponse
}

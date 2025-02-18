// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripRetrieveParams
import org.onebusaway.models.TripRetrieveResponse

interface TripService {

    /** Get details of a specific trip */
    fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripRetrieveResponse
}

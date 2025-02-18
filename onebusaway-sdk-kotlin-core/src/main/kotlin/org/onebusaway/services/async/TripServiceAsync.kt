// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripRetrieveParams
import org.onebusaway.models.TripRetrieveResponse

interface TripServiceAsync {

    /** Get details of a specific trip */
    suspend fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripRetrieveResponse
}

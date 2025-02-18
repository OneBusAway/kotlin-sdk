// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.RouteRetrieveParams
import org.onebusaway.models.RouteRetrieveResponse

interface RouteService {

    /** Retrieve information for a specific route identified by its unique ID. */
    fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteRetrieveResponse
}

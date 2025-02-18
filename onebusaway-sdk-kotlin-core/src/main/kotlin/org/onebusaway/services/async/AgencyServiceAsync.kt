// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.AgencyRetrieveParams
import org.onebusaway.models.AgencyRetrieveResponse

interface AgencyServiceAsync {

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    suspend fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgencyRetrieveResponse
}

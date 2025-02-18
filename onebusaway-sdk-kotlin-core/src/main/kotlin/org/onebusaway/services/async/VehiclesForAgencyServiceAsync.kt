// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.VehiclesForAgencyListParams
import org.onebusaway.models.VehiclesForAgencyListResponse

interface VehiclesForAgencyServiceAsync {

    /** Get vehicles for a specific agency */
    suspend fun list(
        params: VehiclesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VehiclesForAgencyListResponse
}

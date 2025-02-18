// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.AgenciesWithCoverageListParams
import org.onebusaway.models.AgenciesWithCoverageListResponse

interface AgenciesWithCoverageService {

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    fun list(
        params: AgenciesWithCoverageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgenciesWithCoverageListResponse
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.BlockRetrieveParams
import org.onebusaway.models.BlockRetrieveResponse

interface BlockService {

    /** Get details of a specific block by ID */
    fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockRetrieveResponse
}

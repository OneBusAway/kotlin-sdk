// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.BlockRetrieveParams
import org.onebusaway.models.BlockRetrieveResponse

interface BlockServiceAsync {

    /** Get details of a specific block by ID */
    suspend fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BlockRetrieveResponse
}

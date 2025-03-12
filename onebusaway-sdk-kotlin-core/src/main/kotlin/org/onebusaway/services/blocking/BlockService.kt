// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.BlockRetrieveParams
import org.onebusaway.models.BlockRetrieveResponse

interface BlockService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details of a specific block by ID */
    fun retrieve(params: BlockRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): BlockRetrieveResponse

    /**
     * A view of [BlockService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/block/{blockID}.json`, but is
         * otherwise the same as [BlockService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: BlockRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<BlockRetrieveResponse>
    }
}

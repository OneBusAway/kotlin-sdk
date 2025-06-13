// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.block.BlockRetrieveParams
import org.onebusaway.models.block.BlockRetrieveResponse

interface BlockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BlockServiceAsync

    /** Get details of a specific block by ID */
    suspend fun retrieve(
        blockId: String,
        params: BlockRetrieveParams = BlockRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockRetrieveResponse = retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(blockId: String, requestOptions: RequestOptions): BlockRetrieveResponse =
        retrieve(blockId, BlockRetrieveParams.none(), requestOptions)

    /** A view of [BlockServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BlockServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/block/{blockID}.json`, but is otherwise
         * the same as [BlockServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            blockId: String,
            params: BlockRetrieveParams = BlockRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockRetrieveResponse> =
            retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: BlockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            blockId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockRetrieveResponse> =
            retrieve(blockId, BlockRetrieveParams.none(), requestOptions)
    }
}

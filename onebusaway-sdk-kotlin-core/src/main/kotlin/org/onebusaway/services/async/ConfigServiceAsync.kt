// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ConfigRetrieveParams
import org.onebusaway.models.ConfigRetrieveResponse

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** config */
    suspend fun retrieve(params: ConfigRetrieveParams = ConfigRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ConfigRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(requestOptions: RequestOptions): ConfigRetrieveResponse = retrieve(ConfigRetrieveParams.none(), requestOptions)

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/config.json`, but is otherwise
         * the same as [ConfigServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: ConfigRetrieveParams = ConfigRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ConfigRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(requestOptions: RequestOptions): HttpResponseFor<ConfigRetrieveResponse> = retrieve(ConfigRetrieveParams.none(), requestOptions)
    }
}

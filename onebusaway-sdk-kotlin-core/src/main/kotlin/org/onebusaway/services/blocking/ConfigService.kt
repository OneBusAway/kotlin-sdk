// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.config.ConfigRetrieveParams
import org.onebusaway.models.config.ConfigRetrieveResponse

interface ConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** config */
    fun retrieve(
        params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): ConfigRetrieveResponse =
        retrieve(ConfigRetrieveParams.none(), requestOptions)

    /** A view of [ConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/config.json`, but is otherwise the same
         * as [ConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<ConfigRetrieveResponse> =
            retrieve(ConfigRetrieveParams.none(), requestOptions)
    }
}

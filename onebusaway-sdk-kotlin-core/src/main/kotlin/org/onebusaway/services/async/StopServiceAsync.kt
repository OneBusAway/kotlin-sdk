// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.StopRetrieveParams
import org.onebusaway.models.StopRetrieveResponse

interface StopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details of a specific stop */
    suspend fun retrieve(params: StopRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): StopRetrieveResponse

    /**
     * A view of [StopServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/stop/{stopID}.json`, but is
         * otherwise the same as [StopServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: StopRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StopRetrieveResponse>
    }
}

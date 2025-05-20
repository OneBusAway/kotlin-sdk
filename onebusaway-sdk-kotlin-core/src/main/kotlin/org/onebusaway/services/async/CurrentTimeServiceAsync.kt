// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.currenttime.CurrentTimeRetrieveParams
import org.onebusaway.models.currenttime.CurrentTimeRetrieveResponse

interface CurrentTimeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** current-time */
    suspend fun retrieve(
        params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentTimeRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(requestOptions: RequestOptions): CurrentTimeRetrieveResponse =
        retrieve(CurrentTimeRetrieveParams.none(), requestOptions)

    /**
     * A view of [CurrentTimeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/current-time.json`, but is otherwise the
         * same as [CurrentTimeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentTimeRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<CurrentTimeRetrieveResponse> =
            retrieve(CurrentTimeRetrieveParams.none(), requestOptions)
    }
}

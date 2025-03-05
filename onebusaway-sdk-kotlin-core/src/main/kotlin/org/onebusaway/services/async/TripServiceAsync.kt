// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.TripRetrieveParams
import org.onebusaway.models.TripRetrieveResponse

interface TripServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details of a specific trip */
    suspend fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripRetrieveResponse

    /** A view of [TripServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trip/{tripID}.json`, but is otherwise the
         * same as [TripServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: TripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripRetrieveResponse>
    }
}

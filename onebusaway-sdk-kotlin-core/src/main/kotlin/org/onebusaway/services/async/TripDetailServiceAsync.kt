// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.TripDetailRetrieveParams
import org.onebusaway.models.TripDetailRetrieveResponse

interface TripDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve Trip Details */
    suspend fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripDetailRetrieveResponse

    /**
     * A view of [TripDetailServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trip-details/{tripID}.json`, but is
         * otherwise the same as [TripDetailServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: TripDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripDetailRetrieveResponse>
    }
}

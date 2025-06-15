// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripsforlocation.TripsForLocationListParams
import org.onebusaway.models.tripsforlocation.TripsForLocationListResponse

interface TripsForLocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TripsForLocationServiceAsync

    /** Retrieve trips for a given location */
    suspend fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripsForLocationListResponse

    /**
     * A view of [TripsForLocationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TripsForLocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trips-for-location.json`, but is
         * otherwise the same as [TripsForLocationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TripsForLocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripsForLocationListResponse>
    }
}

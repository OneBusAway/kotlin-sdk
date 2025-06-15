// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.routesforlocation.RoutesForLocationListParams
import org.onebusaway.models.routesforlocation.RoutesForLocationListResponse

interface RoutesForLocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RoutesForLocationServiceAsync

    /** routes-for-location */
    suspend fun list(
        params: RoutesForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForLocationListResponse

    /**
     * A view of [RoutesForLocationServiceAsync] that provides access to raw HTTP responses for each
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
        ): RoutesForLocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/routes-for-location.json`, but is
         * otherwise the same as [RoutesForLocationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: RoutesForLocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutesForLocationListResponse>
    }
}

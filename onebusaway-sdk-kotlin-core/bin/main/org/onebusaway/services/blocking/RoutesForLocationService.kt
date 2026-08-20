// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.routesforlocation.RoutesForLocationListParams
import org.onebusaway.models.routesforlocation.RoutesForLocationListResponse

interface RoutesForLocationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RoutesForLocationService

    /** routes-for-location */
    fun list(
        params: RoutesForLocationListParams = RoutesForLocationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForLocationListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): RoutesForLocationListResponse =
        list(RoutesForLocationListParams.none(), requestOptions)

    /**
     * A view of [RoutesForLocationService] that provides access to raw HTTP responses for each
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
        ): RoutesForLocationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/routes-for-location.json`, but is
         * otherwise the same as [RoutesForLocationService.list].
         */
        @MustBeClosed
        fun list(
            params: RoutesForLocationListParams = RoutesForLocationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutesForLocationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RoutesForLocationListResponse> =
            list(RoutesForLocationListParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.searchforroute.SearchForRouteListParams
import org.onebusaway.models.searchforroute.SearchForRouteListResponse

interface SearchForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SearchForRouteServiceAsync

    /** Search for a route based on its name. */
    suspend fun list(
        params: SearchForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchForRouteListResponse

    /**
     * A view of [SearchForRouteServiceAsync] that provides access to raw HTTP responses for each
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
        ): SearchForRouteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/search/route.json`, but is otherwise the
         * same as [SearchForRouteServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SearchForRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchForRouteListResponse>
    }
}

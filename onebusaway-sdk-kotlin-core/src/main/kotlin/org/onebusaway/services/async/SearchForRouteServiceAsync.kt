// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.SearchForRouteListParams
import org.onebusaway.models.SearchForRouteListResponse

interface SearchForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.SearchForStopListParams
import org.onebusaway.models.SearchForStopListResponse

interface SearchForStopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Search for a stop based on its name. */
    suspend fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchForStopListResponse

    /**
     * A view of [SearchForStopServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/search/stop.json`, but is otherwise the
         * same as [SearchForStopServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SearchForStopListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchForStopListResponse>
    }
}

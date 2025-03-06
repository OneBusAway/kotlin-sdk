// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.StopsForLocationListParams
import org.onebusaway.models.StopsForLocationListResponse

interface StopsForLocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** stops-for-location */
    suspend fun list(
        params: StopsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForLocationListResponse

    /**
     * A view of [StopsForLocationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-location.json`, but is
         * otherwise the same as [StopsForLocationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: StopsForLocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForLocationListResponse>
    }
}

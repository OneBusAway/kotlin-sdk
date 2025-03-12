// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.StopsForAgencyListParams
import org.onebusaway.models.StopsForAgencyListResponse

interface StopsForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get stops for a specific agency */
    suspend fun list(
        params: StopsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForAgencyListResponse

    /**
     * A view of [StopsForAgencyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-agency/{agencyID}.json`, but is
         * otherwise the same as [StopsForAgencyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: StopsForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForAgencyListResponse>
    }
}

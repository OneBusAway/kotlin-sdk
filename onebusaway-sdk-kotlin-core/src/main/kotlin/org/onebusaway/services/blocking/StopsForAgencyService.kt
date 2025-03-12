// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.StopsForAgencyListParams
import org.onebusaway.models.StopsForAgencyListResponse

interface StopsForAgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get stops for a specific agency */
    fun list(params: StopsForAgencyListParams, requestOptions: RequestOptions = RequestOptions.none()): StopsForAgencyListResponse

    /**
     * A view of [StopsForAgencyService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /api/where/stops-for-agency/{agencyID}.json`, but is otherwise the same as
         * [StopsForAgencyService.list].
         */
        @MustBeClosed
        fun list(params: StopsForAgencyListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StopsForAgencyListResponse>
    }
}

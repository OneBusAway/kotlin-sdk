// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.StopIdsForAgencyListParams
import org.onebusaway.models.StopIdsForAgencyListResponse

interface StopIdsForAgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get stop IDs for a specific agency */
    fun list(params: StopIdsForAgencyListParams, requestOptions: RequestOptions = RequestOptions.none()): StopIdsForAgencyListResponse

    /**
     * A view of [StopIdsForAgencyService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /api/where/stop-ids-for-agency/{agencyID}.json`, but is otherwise the same
         * as [StopIdsForAgencyService.list].
         */
        @MustBeClosed
        fun list(params: StopIdsForAgencyListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<StopIdsForAgencyListResponse>
    }
}

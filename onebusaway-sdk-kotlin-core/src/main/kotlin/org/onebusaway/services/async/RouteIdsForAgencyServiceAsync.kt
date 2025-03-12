// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.RouteIdsForAgencyListParams
import org.onebusaway.models.RouteIdsForAgencyListResponse

interface RouteIdsForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get route IDs for a specific agency */
    suspend fun list(params: RouteIdsForAgencyListParams, requestOptions: RequestOptions = RequestOptions.none()): RouteIdsForAgencyListResponse

    /**
     * A view of [RouteIdsForAgencyServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /api/where/route-ids-for-agency/{agencyID}.json`, but is otherwise the same
         * as [RouteIdsForAgencyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: RouteIdsForAgencyListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RouteIdsForAgencyListResponse>
    }
}

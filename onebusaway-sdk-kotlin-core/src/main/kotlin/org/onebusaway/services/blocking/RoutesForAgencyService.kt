// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.RoutesForAgencyListParams
import org.onebusaway.models.RoutesForAgencyListResponse

interface RoutesForAgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the list of all routes for a particular agency by id */
    fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForAgencyListResponse

    /**
     * A view of [RoutesForAgencyService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/routes-for-agency/{agencyID}.json`, but
         * is otherwise the same as [RoutesForAgencyService.list].
         */
        @MustBeClosed
        fun list(
            params: RoutesForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutesForAgencyListResponse>
    }
}

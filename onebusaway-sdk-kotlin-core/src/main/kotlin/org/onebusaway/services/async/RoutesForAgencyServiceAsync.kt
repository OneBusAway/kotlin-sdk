// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.RoutesForAgencyListParams
import org.onebusaway.models.RoutesForAgencyListResponse

interface RoutesForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the list of all routes for a particular agency by id */
    suspend fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForAgencyListResponse

    /**
     * A view of [RoutesForAgencyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/routes-for-agency/{agencyID}.json`, but
         * is otherwise the same as [RoutesForAgencyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: RoutesForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutesForAgencyListResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.AgenciesWithCoverageListParams
import org.onebusaway.models.AgenciesWithCoverageListResponse

interface AgenciesWithCoverageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    fun list(
        params: AgenciesWithCoverageListParams = AgenciesWithCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgenciesWithCoverageListResponse

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    fun list(requestOptions: RequestOptions): AgenciesWithCoverageListResponse =
        list(AgenciesWithCoverageListParams.none(), requestOptions)

    /**
     * A view of [AgenciesWithCoverageService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/agencies-with-coverage.json`, but is
         * otherwise the same as [AgenciesWithCoverageService.list].
         */
        @MustBeClosed
        fun list(
            params: AgenciesWithCoverageListParams = AgenciesWithCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgenciesWithCoverageListResponse>

        /**
         * Returns a raw HTTP response for `get /api/where/agencies-with-coverage.json`, but is
         * otherwise the same as [AgenciesWithCoverageService.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AgenciesWithCoverageListResponse> =
            list(AgenciesWithCoverageListParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListParams
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListResponse

interface AgenciesWithCoverageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    suspend fun list(
        params: AgenciesWithCoverageListParams = AgenciesWithCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgenciesWithCoverageListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AgenciesWithCoverageListResponse =
        list(AgenciesWithCoverageListParams.none(), requestOptions)

    /**
     * A view of [AgenciesWithCoverageServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/agencies-with-coverage.json`, but is
         * otherwise the same as [AgenciesWithCoverageServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AgenciesWithCoverageListParams = AgenciesWithCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgenciesWithCoverageListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AgenciesWithCoverageListResponse> =
            list(AgenciesWithCoverageListParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.routesforagency.RoutesForAgencyListParams
import org.onebusaway.models.routesforagency.RoutesForAgencyListResponse

interface RoutesForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RoutesForAgencyServiceAsync

    /** Retrieve the list of all routes for a particular agency by id */
    suspend fun list(
        agencyId: String,
        params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForAgencyListResponse =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForAgencyListResponse

    /** @see [list] */
    suspend fun list(
        agencyId: String,
        requestOptions: RequestOptions,
    ): RoutesForAgencyListResponse =
        list(agencyId, RoutesForAgencyListParams.none(), requestOptions)

    /**
     * A view of [RoutesForAgencyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RoutesForAgencyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/routes-for-agency/{agencyID}.json`, but
         * is otherwise the same as [RoutesForAgencyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            agencyId: String,
            params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutesForAgencyListResponse> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: RoutesForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutesForAgencyListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutesForAgencyListResponse> =
            list(agencyId, RoutesForAgencyListParams.none(), requestOptions)
    }
}

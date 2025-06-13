// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopsforagency.StopsForAgencyListParams
import org.onebusaway.models.stopsforagency.StopsForAgencyListResponse

interface StopsForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StopsForAgencyServiceAsync

    /** Get stops for a specific agency */
    suspend fun list(
        agencyId: String,
        params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForAgencyListResponse =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: StopsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForAgencyListResponse

    /** @see [list] */
    suspend fun list(agencyId: String, requestOptions: RequestOptions): StopsForAgencyListResponse =
        list(agencyId, StopsForAgencyListParams.none(), requestOptions)

    /**
     * A view of [StopsForAgencyServiceAsync] that provides access to raw HTTP responses for each
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
        ): StopsForAgencyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-agency/{agencyID}.json`, but is
         * otherwise the same as [StopsForAgencyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            agencyId: String,
            params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForAgencyListResponse> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: StopsForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForAgencyListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopsForAgencyListResponse> =
            list(agencyId, StopsForAgencyListParams.none(), requestOptions)
    }
}

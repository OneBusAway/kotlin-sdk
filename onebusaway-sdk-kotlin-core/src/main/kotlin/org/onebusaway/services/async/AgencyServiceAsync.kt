// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.agency.AgencyRetrieveParams
import org.onebusaway.models.agency.AgencyRetrieveResponse

interface AgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgencyServiceAsync

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    suspend fun retrieve(
        agencyId: String,
        params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgencyRetrieveResponse =
        retrieve(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgencyRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(agencyId: String, requestOptions: RequestOptions): AgencyRetrieveResponse =
        retrieve(agencyId, AgencyRetrieveParams.none(), requestOptions)

    /**
     * A view of [AgencyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AgencyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/agency/{agencyID}.json`, but is otherwise
         * the same as [AgencyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            agencyId: String,
            params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgencyRetrieveResponse> =
            retrieve(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: AgencyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgencyRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgencyRetrieveResponse> =
            retrieve(agencyId, AgencyRetrieveParams.none(), requestOptions)
    }
}

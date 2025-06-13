// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ResponseWrapper
import org.onebusaway.models.reportproblemwithtrip.ReportProblemWithTripRetrieveParams

interface ReportProblemWithTripServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReportProblemWithTripServiceAsync

    /** Submit a user-generated problem report for a particular trip. */
    suspend fun retrieve(
        tripId: String,
        params: ReportProblemWithTripRetrieveParams = ReportProblemWithTripRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper = retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ReportProblemWithTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper

    /** @see [retrieve] */
    suspend fun retrieve(tripId: String, requestOptions: RequestOptions): ResponseWrapper =
        retrieve(tripId, ReportProblemWithTripRetrieveParams.none(), requestOptions)

    /**
     * A view of [ReportProblemWithTripServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReportProblemWithTripServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/report-problem-with-trip/{tripID}.json`,
         * but is otherwise the same as [ReportProblemWithTripServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            tripId: String,
            params: ReportProblemWithTripRetrieveParams =
                ReportProblemWithTripRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper> =
            retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ReportProblemWithTripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            tripId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseWrapper> =
            retrieve(tripId, ReportProblemWithTripRetrieveParams.none(), requestOptions)
    }
}

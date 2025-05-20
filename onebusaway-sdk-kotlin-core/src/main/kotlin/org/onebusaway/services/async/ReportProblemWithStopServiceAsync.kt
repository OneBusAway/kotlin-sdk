// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ResponseWrapper
import org.onebusaway.models.reportproblemwithstop.ReportProblemWithStopRetrieveParams

interface ReportProblemWithStopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Submit a user-generated problem report for a stop */
    suspend fun retrieve(
        stopId: String,
        params: ReportProblemWithStopRetrieveParams = ReportProblemWithStopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper = retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ReportProblemWithStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper

    /** @see [retrieve] */
    suspend fun retrieve(stopId: String, requestOptions: RequestOptions): ResponseWrapper =
        retrieve(stopId, ReportProblemWithStopRetrieveParams.none(), requestOptions)

    /**
     * A view of [ReportProblemWithStopServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/report-problem-with-stop/{stopID}.json`,
         * but is otherwise the same as [ReportProblemWithStopServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            stopId: String,
            params: ReportProblemWithStopRetrieveParams =
                ReportProblemWithStopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ReportProblemWithStopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseWrapper> =
            retrieve(stopId, ReportProblemWithStopRetrieveParams.none(), requestOptions)
    }
}

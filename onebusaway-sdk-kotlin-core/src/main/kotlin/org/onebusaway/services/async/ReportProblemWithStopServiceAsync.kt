// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ReportProblemWithStopRetrieveParams
import org.onebusaway.models.ResponseWrapper

interface ReportProblemWithStopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Submit a user-generated problem report for a stop */
    suspend fun retrieve(
        params: ReportProblemWithStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper

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
            params: ReportProblemWithStopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper>
    }
}

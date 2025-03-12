// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ReportProblemWithTripRetrieveParams
import org.onebusaway.models.ResponseWrapper

interface ReportProblemWithTripService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Submit a user-generated problem report for a particular trip. */
    fun retrieve(
        params: ReportProblemWithTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper

    /**
     * A view of [ReportProblemWithTripService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/report-problem-with-trip/{tripID}.json`,
         * but is otherwise the same as [ReportProblemWithTripService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ReportProblemWithTripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper>
    }
}

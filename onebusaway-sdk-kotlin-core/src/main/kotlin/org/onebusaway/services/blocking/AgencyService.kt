// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.AgencyRetrieveParams
import org.onebusaway.models.AgencyRetrieveResponse

interface AgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    fun retrieve(params: AgencyRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AgencyRetrieveResponse

    /**
     * A view of [AgencyService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/agency/{agencyID}.json`, but is
         * otherwise the same as [AgencyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AgencyRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AgencyRetrieveResponse>
    }
}

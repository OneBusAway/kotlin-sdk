// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.AgencyRetrieveParams
import org.onebusaway.models.AgencyRetrieveResponse

interface AgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    suspend fun retrieve(params: AgencyRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AgencyRetrieveResponse

    /**
     * A view of [AgencyServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/agency/{agencyID}.json`, but is
         * otherwise the same as [AgencyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: AgencyRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AgencyRetrieveResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ArrivalAndDepartureListParams
import org.onebusaway.models.ArrivalAndDepartureListResponse
import org.onebusaway.models.ArrivalAndDepartureRetrieveParams
import org.onebusaway.models.ArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** arrival-and-departure-for-stop */
    suspend fun retrieve(params: ArrivalAndDepartureRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): ArrivalAndDepartureRetrieveResponse

    /** arrivals-and-departures-for-stop */
    suspend fun list(params: ArrivalAndDepartureListParams, requestOptions: RequestOptions = RequestOptions.none()): ArrivalAndDepartureListResponse

    /**
     * A view of [ArrivalAndDepartureServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /api/where/arrival-and-departure-for-stop/{stopID}.json`, but is otherwise
         * the same as [ArrivalAndDepartureServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: ArrivalAndDepartureRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ArrivalAndDepartureRetrieveResponse>

        /**
         * Returns a raw HTTP response for
         * `get /api/where/arrivals-and-departures-for-stop/{stopID}.json`, but is
         * otherwise the same as [ArrivalAndDepartureServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: ArrivalAndDepartureListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ArrivalAndDepartureListResponse>
    }
}

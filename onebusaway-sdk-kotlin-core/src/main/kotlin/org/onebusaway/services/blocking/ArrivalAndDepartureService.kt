// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ArrivalAndDepartureListParams
import org.onebusaway.models.ArrivalAndDepartureListResponse
import org.onebusaway.models.ArrivalAndDepartureRetrieveParams
import org.onebusaway.models.ArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** arrival-and-departure-for-stop */
    fun retrieve(params: ArrivalAndDepartureRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): ArrivalAndDepartureRetrieveResponse

    /** arrivals-and-departures-for-stop */
    fun list(params: ArrivalAndDepartureListParams, requestOptions: RequestOptions = RequestOptions.none()): ArrivalAndDepartureListResponse

    /**
     * A view of [ArrivalAndDepartureService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /api/where/arrival-and-departure-for-stop/{stopID}.json`, but is otherwise
         * the same as [ArrivalAndDepartureService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ArrivalAndDepartureRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ArrivalAndDepartureRetrieveResponse>

        /**
         * Returns a raw HTTP response for
         * `get /api/where/arrivals-and-departures-for-stop/{stopID}.json`, but is
         * otherwise the same as [ArrivalAndDepartureService.list].
         */
        @MustBeClosed
        fun list(params: ArrivalAndDepartureListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ArrivalAndDepartureListResponse>
    }
}

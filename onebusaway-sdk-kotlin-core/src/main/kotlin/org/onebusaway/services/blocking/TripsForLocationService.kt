// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripsforlocation.TripsForLocationListParams
import org.onebusaway.models.tripsforlocation.TripsForLocationListResponse

interface TripsForLocationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve trips for a given location */
    fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripsForLocationListResponse

    /**
     * A view of [TripsForLocationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trips-for-location.json`, but is
         * otherwise the same as [TripsForLocationService.list].
         */
        @MustBeClosed
        fun list(
            params: TripsForLocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripsForLocationListResponse>
    }
}

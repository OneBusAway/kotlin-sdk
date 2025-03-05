// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.VehiclesForAgencyListParams
import org.onebusaway.models.VehiclesForAgencyListResponse

interface VehiclesForAgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get vehicles for a specific agency */
    fun list(
        params: VehiclesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VehiclesForAgencyListResponse

    /**
     * A view of [VehiclesForAgencyService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/vehicles-for-agency/{agencyID}.json`, but
         * is otherwise the same as [VehiclesForAgencyService.list].
         */
        @MustBeClosed
        fun list(
            params: VehiclesForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VehiclesForAgencyListResponse>
    }
}

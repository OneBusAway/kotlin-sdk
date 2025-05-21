// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.vehiclesforagency.VehiclesForAgencyListParams
import org.onebusaway.models.vehiclesforagency.VehiclesForAgencyListResponse

interface VehiclesForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get vehicles for a specific agency */
    suspend fun list(
        agencyId: String,
        params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VehiclesForAgencyListResponse =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: VehiclesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VehiclesForAgencyListResponse

    /** @see [list] */
    suspend fun list(
        agencyId: String,
        requestOptions: RequestOptions,
    ): VehiclesForAgencyListResponse =
        list(agencyId, VehiclesForAgencyListParams.none(), requestOptions)

    /**
     * A view of [VehiclesForAgencyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/vehicles-for-agency/{agencyID}.json`, but
         * is otherwise the same as [VehiclesForAgencyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            agencyId: String,
            params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VehiclesForAgencyListResponse> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: VehiclesForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VehiclesForAgencyListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VehiclesForAgencyListResponse> =
            list(agencyId, VehiclesForAgencyListParams.none(), requestOptions)
    }
}

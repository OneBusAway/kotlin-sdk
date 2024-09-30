// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripsForLocationListParams
import org.onebusaway.models.TripsForLocationListResponse

interface TripsForLocationServiceAsync {

    /** Retrieve trips for a given location */
    suspend fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripsForLocationListResponse
}
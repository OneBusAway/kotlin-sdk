// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripDetailRetrieveParams
import org.onebusaway.models.TripDetailRetrieveResponse

interface TripDetailServiceAsync {

    /** Retrieve Trip Details */
    suspend fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripDetailRetrieveResponse
}

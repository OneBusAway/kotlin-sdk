// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ShapeRetrieveParams
import org.onebusaway.models.ShapeRetrieveResponse

interface ShapeServiceAsync {

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    suspend fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ShapeRetrieveResponse
}

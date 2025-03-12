// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ShapeRetrieveParams
import org.onebusaway.models.ShapeRetrieveResponse

interface ShapeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    suspend fun retrieve(params: ShapeRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): ShapeRetrieveResponse

    /**
     * A view of [ShapeServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/shape/{shapeID}.json`, but is
         * otherwise the same as [ShapeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: ShapeRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ShapeRetrieveResponse>
    }
}

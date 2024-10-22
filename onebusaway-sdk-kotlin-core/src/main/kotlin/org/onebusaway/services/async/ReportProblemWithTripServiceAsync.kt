// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ReportProblemWithTripRetrieveParams
import org.onebusaway.models.ResponseWrapper

interface ReportProblemWithTripServiceAsync {

    /** Submit a user-generated problem report for a particular trip. */
    suspend fun retrieve(
        params: ReportProblemWithTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseWrapper
}

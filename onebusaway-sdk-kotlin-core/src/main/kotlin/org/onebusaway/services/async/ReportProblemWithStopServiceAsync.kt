// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ReportProblemWithStopRetrieveParams
import org.onebusaway.models.ResponseWrapper

interface ReportProblemWithStopServiceAsync {

    /** Submit a user-generated problem report for a stop */
    suspend fun retrieve(
        params: ReportProblemWithStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseWrapper
}

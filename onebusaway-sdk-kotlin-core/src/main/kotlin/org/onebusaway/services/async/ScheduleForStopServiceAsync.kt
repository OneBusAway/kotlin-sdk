// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ScheduleForStopRetrieveParams
import org.onebusaway.models.ScheduleForStopRetrieveResponse

interface ScheduleForStopServiceAsync {

    /** Get schedule for a specific stop */
    suspend fun retrieve(
        params: ScheduleForStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScheduleForStopRetrieveResponse
}

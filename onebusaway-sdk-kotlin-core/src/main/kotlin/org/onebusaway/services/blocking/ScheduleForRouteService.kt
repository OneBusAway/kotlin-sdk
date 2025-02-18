// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ScheduleForRouteRetrieveParams
import org.onebusaway.models.ScheduleForRouteRetrieveResponse

interface ScheduleForRouteService {

    /** Retrieve the full schedule for a route on a particular day */
    fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForRouteRetrieveResponse
}

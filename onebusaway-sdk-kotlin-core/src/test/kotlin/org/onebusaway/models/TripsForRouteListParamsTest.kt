// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class TripsForRouteListParamsTest {

    @Test
    fun create() {
        TripsForRouteListParams.builder()
            .routeId("routeID")
            .includeSchedule(true)
            .includeStatus(true)
            .time(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TripsForRouteListParams.builder()
                .routeId("routeID")
                .includeSchedule(true)
                .includeStatus(true)
                .time(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeSchedule", "true")
                    .put("includeStatus", "true")
                    .put("time", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripsForRouteListParams.builder().routeId("routeID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = TripsForRouteListParams.builder().routeId("routeID").build()
        assertThat(params).isNotNull
        // path param "routeId"
        assertThat(params.getPathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

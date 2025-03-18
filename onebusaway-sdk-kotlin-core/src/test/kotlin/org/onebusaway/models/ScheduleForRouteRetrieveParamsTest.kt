// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class ScheduleForRouteRetrieveParamsTest {

    @Test
    fun create() {
        ScheduleForRouteRetrieveParams.builder()
            .routeId("1_100223")
            .date(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ScheduleForRouteRetrieveParams.builder()
                .routeId("1_100223")
                .date(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("date", "2019-12-27").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ScheduleForRouteRetrieveParams.builder().routeId("1_100223").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = ScheduleForRouteRetrieveParams.builder().routeId("1_100223").build()
        assertThat(params).isNotNull
        // path param "routeId"
        assertThat(params.getPathParam(0)).isEqualTo("1_100223")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

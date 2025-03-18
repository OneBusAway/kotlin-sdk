// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class StopsForRouteListParamsTest {

    @Test
    fun create() {
        StopsForRouteListParams.builder()
            .routeId("routeID")
            .includePolylines(true)
            .time("time")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            StopsForRouteListParams.builder()
                .routeId("routeID")
                .includePolylines(true)
                .time("time")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("includePolylines", "true").put("time", "time").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StopsForRouteListParams.builder().routeId("routeID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = StopsForRouteListParams.builder().routeId("routeID").build()
        assertThat(params).isNotNull
        // path param "routeId"
        assertThat(params.getPathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

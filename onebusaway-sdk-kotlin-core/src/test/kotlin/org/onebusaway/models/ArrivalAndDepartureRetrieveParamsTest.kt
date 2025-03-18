// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class ArrivalAndDepartureRetrieveParamsTest {

    @Test
    fun create() {
        ArrivalAndDepartureRetrieveParams.builder()
            .stopId("1_75403")
            .serviceDate(0L)
            .tripId("tripId")
            .stopSequence(0L)
            .time(0L)
            .vehicleId("vehicleId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ArrivalAndDepartureRetrieveParams.builder()
                .stopId("1_75403")
                .serviceDate(0L)
                .tripId("tripId")
                .stopSequence(0L)
                .time(0L)
                .vehicleId("vehicleId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("serviceDate", "0")
                    .put("tripId", "tripId")
                    .put("stopSequence", "0")
                    .put("time", "0")
                    .put("vehicleId", "vehicleId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ArrivalAndDepartureRetrieveParams.builder()
                .stopId("1_75403")
                .serviceDate(0L)
                .tripId("tripId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("serviceDate", "0").put("tripId", "tripId").build()
            )
    }

    @Test
    fun getPathParam() {
        val params =
            ArrivalAndDepartureRetrieveParams.builder()
                .stopId("1_75403")
                .serviceDate(0L)
                .tripId("tripId")
                .build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("1_75403")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

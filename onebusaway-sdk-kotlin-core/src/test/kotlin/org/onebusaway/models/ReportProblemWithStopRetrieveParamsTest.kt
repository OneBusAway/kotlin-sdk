// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class ReportProblemWithStopRetrieveParamsTest {

    @Test
    fun create() {
        ReportProblemWithStopRetrieveParams.builder()
            .stopId("stopID")
            .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
            .userComment("userComment")
            .userLat(0.0)
            .userLocationAccuracy(0.0)
            .userLon(0.0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReportProblemWithStopRetrieveParams.builder()
                .stopId("stopID")
                .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
                .userComment("userComment")
                .userLat(0.0)
                .userLocationAccuracy(0.0)
                .userLon(0.0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("code", "stop_name_wrong")
                    .put("userComment", "userComment")
                    .put("userLat", "0.0")
                    .put("userLocationAccuracy", "0.0")
                    .put("userLon", "0.0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReportProblemWithStopRetrieveParams.builder().stopId("stopID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = ReportProblemWithStopRetrieveParams.builder().stopId("stopID").build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("stopID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams
import org.onebusaway.models.*

class ReportProblemWithStopRetrieveParamsTest {

    @Test
    fun createReportProblemWithStopRetrieveParams() {
        ReportProblemWithStopRetrieveParams.builder()
            .stopId("stopID")
            .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
            .userComment("userComment")
            .userLat(42.23)
            .userLocationAccuracy(42.23)
            .userLon(42.23)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ReportProblemWithStopRetrieveParams.builder()
                .stopId("stopID")
                .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
                .userComment("userComment")
                .userLat(42.23)
                .userLocationAccuracy(42.23)
                .userLon(42.23)
                .build()
        val expected = QueryParams.builder()
        expected.put("code", ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG.toString())
        expected.put("userComment", "userComment")
        expected.put("userLat", "42.23")
        expected.put("userLocationAccuracy", "42.23")
        expected.put("userLon", "42.23")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ReportProblemWithStopRetrieveParams.builder().stopId("stopID").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
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
// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.ReportProblemWithStopRetrieveParams

@ExtendWith(TestServerExtension::class)
class ReportProblemWithStopServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportProblemWithStopServiceAsync = client.reportProblemWithStop()

        val responseWrapper =
            reportProblemWithStopServiceAsync.retrieve(
                ReportProblemWithStopRetrieveParams.builder()
                    .stopId("stopID")
                    .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
                    .userComment("userComment")
                    .userLat(0.0)
                    .userLocationAccuracy(0.0)
                    .userLon(0.0)
                    .build()
            )

        responseWrapper.validate()
    }
}

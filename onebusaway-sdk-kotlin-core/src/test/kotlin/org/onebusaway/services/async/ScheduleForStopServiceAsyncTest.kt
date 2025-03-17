// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.ScheduleForStopRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ScheduleForStopServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduleForStopServiceAsync = client.scheduleForStop()

        val scheduleForStop =
            scheduleForStopServiceAsync.retrieve(
                ScheduleForStopRetrieveParams.builder()
                    .stopId("stopID")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )

        scheduleForStop.validate()
    }
}

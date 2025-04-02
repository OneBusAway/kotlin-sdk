// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.ArrivalAndDepartureListParams
import org.onebusaway.models.ArrivalAndDepartureRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ArrivalAndDepartureServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val arrivalAndDepartureServiceAsync = client.arrivalAndDeparture()

        val arrivalAndDeparture =
            arrivalAndDepartureServiceAsync.retrieve(
                ArrivalAndDepartureRetrieveParams.builder()
                    .stopId("1_75403")
                    .serviceDate(0L)
                    .tripId("tripId")
                    .stopSequence(0L)
                    .time(0L)
                    .vehicleId("vehicleId")
                    .build()
            )

        arrivalAndDeparture.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val arrivalAndDepartureServiceAsync = client.arrivalAndDeparture()

        val arrivalAndDepartures =
            arrivalAndDepartureServiceAsync.list(
                ArrivalAndDepartureListParams.builder()
                    .stopId("1_75403")
                    .minutesAfter(0L)
                    .minutesBefore(0L)
                    .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        arrivalAndDepartures.validate()
    }
}

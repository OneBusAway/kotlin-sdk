// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.*

@ExtendWith(TestServerExtension::class)
class TripsForLocationServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripsForLocationService = client.tripsForLocation()
        val tripsForLocationListResponse =
            tripsForLocationService.list(
                TripsForLocationListParams.builder()
                    .lat(42.23)
                    .latSpan(42.23)
                    .lon(42.23)
                    .lonSpan(42.23)
                    .includeSchedule(true)
                    .includeTrip(true)
                    .time(123L)
                    .build()
            )
        println(tripsForLocationListResponse)
    }
}
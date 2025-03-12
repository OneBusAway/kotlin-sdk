// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.TripsForLocationListParams

@ExtendWith(TestServerExtension::class)
class TripsForLocationServiceAsyncTest {

    @Test
    suspend fun list() {
      val client = OnebusawaySdkOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val tripsForLocationServiceAsync = client.tripsForLocation()

      val tripsForLocation = tripsForLocationServiceAsync.list(TripsForLocationListParams.builder()
          .lat(0.0)
          .latSpan(0.0)
          .lon(0.0)
          .lonSpan(0.0)
          .includeSchedule(true)
          .includeTrip(true)
          .time(0L)
          .build())

      tripsForLocation.validate()
    }
}

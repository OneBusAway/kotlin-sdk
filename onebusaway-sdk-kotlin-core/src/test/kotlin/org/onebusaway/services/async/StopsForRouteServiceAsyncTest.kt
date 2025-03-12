// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.StopsForRouteListParams

@ExtendWith(TestServerExtension::class)
class StopsForRouteServiceAsyncTest {

    @Test
    suspend fun list() {
      val client = OnebusawaySdkOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val stopsForRouteServiceAsync = client.stopsForRoute()

      val stopsForRoute = stopsForRouteServiceAsync.list(StopsForRouteListParams.builder()
          .routeId("routeID")
          .includePolylines(true)
          .time("time")
          .build())

      stopsForRoute.validate()
    }
}

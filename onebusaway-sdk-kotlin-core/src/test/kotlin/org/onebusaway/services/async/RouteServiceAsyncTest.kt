// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.RouteRetrieveParams

@ExtendWith(TestServerExtension::class)
class RouteServiceAsyncTest {

    @Test
    suspend fun retrieve() {
      val client = OnebusawaySdkOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val routeServiceAsync = client.route()

      val route = routeServiceAsync.retrieve(RouteRetrieveParams.builder()
          .routeId("routeID")
          .build())

      route.validate()
    }
}

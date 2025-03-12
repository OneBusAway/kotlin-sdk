// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.RoutesForAgencyListParams

@ExtendWith(TestServerExtension::class)
class RoutesForAgencyServiceAsyncTest {

    @Test
    suspend fun list() {
      val client = OnebusawaySdkOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val routesForAgencyServiceAsync = client.routesForAgency()

      val routesForAgency = routesForAgencyServiceAsync.list(RoutesForAgencyListParams.builder()
          .agencyId("40")
          .build())

      routesForAgency.validate()
    }
}

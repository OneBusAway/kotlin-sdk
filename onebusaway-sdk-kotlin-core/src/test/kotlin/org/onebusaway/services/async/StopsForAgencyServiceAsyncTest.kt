// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.StopsForAgencyListParams

@ExtendWith(TestServerExtension::class)
class StopsForAgencyServiceAsyncTest {

    @Test
    suspend fun list() {
      val client = OnebusawaySdkOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val stopsForAgencyServiceAsync = client.stopsForAgency()

      val stopsForAgency = stopsForAgencyServiceAsync.list(StopsForAgencyListParams.builder()
          .agencyId("agencyID")
          .build())

      stopsForAgency.validate()
    }
}

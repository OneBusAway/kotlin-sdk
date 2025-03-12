// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.AgencyRetrieveParams

@ExtendWith(TestServerExtension::class)
class AgencyServiceAsyncTest {

    @Test
    suspend fun retrieve() {
      val client = OnebusawaySdkOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val agencyServiceAsync = client.agency()

      val agency = agencyServiceAsync.retrieve(AgencyRetrieveParams.builder()
          .agencyId("agencyID")
          .build())

      agency.validate()
    }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.AgenciesWithCoverageListParams

@ExtendWith(TestServerExtension::class)
class AgenciesWithCoverageServiceAsyncTest {

    @Test
    suspend fun list() {
      val client = OnebusawaySdkOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val agenciesWithCoverageServiceAsync = client.agenciesWithCoverage()

      val agenciesWithCoverage = agenciesWithCoverageServiceAsync.list()

      agenciesWithCoverage.validate()
    }
}

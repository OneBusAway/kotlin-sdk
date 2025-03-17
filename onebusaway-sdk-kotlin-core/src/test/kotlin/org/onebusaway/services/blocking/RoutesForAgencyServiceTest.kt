// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.RoutesForAgencyListParams

@ExtendWith(TestServerExtension::class)
internal class RoutesForAgencyServiceTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routesForAgencyService = client.routesForAgency()

        val routesForAgency =
            routesForAgencyService.list(RoutesForAgencyListParams.builder().agencyId("40").build())

        routesForAgency.validate()
    }
}

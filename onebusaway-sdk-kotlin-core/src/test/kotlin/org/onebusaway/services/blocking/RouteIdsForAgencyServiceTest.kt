// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.RouteIdsForAgencyListParams

@ExtendWith(TestServerExtension::class)
class RouteIdsForAgencyServiceTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routeIdsForAgencyService = client.routeIdsForAgency()

        val routeIdsForAgency =
            routeIdsForAgencyService.list(
                RouteIdsForAgencyListParams.builder().agencyId("agencyID").build()
            )

        routeIdsForAgency.validate()
    }
}

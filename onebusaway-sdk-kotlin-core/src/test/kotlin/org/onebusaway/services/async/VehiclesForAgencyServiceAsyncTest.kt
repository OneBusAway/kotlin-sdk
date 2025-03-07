// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.VehiclesForAgencyListParams

@ExtendWith(TestServerExtension::class)
class VehiclesForAgencyServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vehiclesForAgencyServiceAsync = client.vehiclesForAgency()

        val vehiclesForAgency =
            vehiclesForAgencyServiceAsync.list(
                VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()
            )

        vehiclesForAgency.validate()
    }
}

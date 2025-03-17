// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.ShapeRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ShapeServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shapeServiceAsync = client.shape()

        val shape =
            shapeServiceAsync.retrieve(ShapeRetrieveParams.builder().shapeId("shapeID").build())

        shape.validate()
    }
}

package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveParams
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveResponse

object TripForVehicle {

    // Retrieve constants from environment variables or fallback to default values
    private val API_KEY: String = System.getenv("ONEBUSAWAY_API_KEY") ?: "TEST"
    private val BASE_URL: String = System.getenv("ONEBUSAWAY_BASE_URL") ?: "https://api.pugetsound.onebusaway.org"

    // Initialize the Onebusaway SDK client
    private val client: OnebusawaySdkClient = OnebusawaySdkOkHttpClient.builder()
        .apiKey(API_KEY)
        .baseUrl(BASE_URL)
        .build()

    @JvmStatic
    fun main(args: Array<String>) {
        // Define the vehicle ID
        val vehicleId = "40_9801"

        // Create the parameters for the trip retrieval request
        val params = TripForVehicleRetrieveParams.builder()
            .vehicleId(vehicleId)
            .build()

        // Retrieve the trip for the vehicle
        val tripForVehicle: TripForVehicleRetrieveResponse = client.tripForVehicle().retrieve(params)

        println(tripForVehicle)
    }
}

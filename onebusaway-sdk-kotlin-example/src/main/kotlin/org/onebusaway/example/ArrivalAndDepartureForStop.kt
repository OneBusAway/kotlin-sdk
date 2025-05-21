package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureRetrieveParams
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureRetrieveResponse

object ArrivalAndDepartureForStop {

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
        // Define the stop ID and trip ID
        val stopId = "1_75403"
        val tripId = "1_604670535"

        // Define the service date directly as a Unix timestamp (in seconds)
        val serviceDate: Long = 1810918000 // Example timestamp

        // Create parameters for arrival and departure request
        val params = ArrivalAndDepartureRetrieveParams.builder()
            .stopId(stopId)
            .tripId(tripId)
            .serviceDate(serviceDate) // Use the Unix timestamp directly
            .build()

        // Retrieve arrival and departure information
        val arrivalAndDepartureForStop: ArrivalAndDepartureRetrieveResponse = client.arrivalAndDeparture().retrieve(params)
        println(arrivalAndDepartureForStop)
    }
}

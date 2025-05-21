package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureListParams
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureListResponse

object ArrivalsAndDeparturesForStop {

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
        // Define the stop ID
        val stopId = "1_75403"
        val minutesBefore: Long = 5
        val minutesAfter: Long = 35


        // Define the parameters for the arrival and departure list request
        val params = ArrivalAndDepartureListParams.builder()
            .stopId(stopId)
            .minutesBefore(minutesBefore)
            .minutesAfter(minutesAfter)
            .build()

        // Retrieve arrival and departure information
        val arrivalsAndDeparturesForStop: ArrivalAndDepartureListResponse = client.arrivalAndDeparture().list(params)

        for (arrivalAndDeparture in arrivalsAndDeparturesForStop.data().entry().arrivalsAndDepartures()) {
            println(arrivalAndDeparture)
        }
    }
}

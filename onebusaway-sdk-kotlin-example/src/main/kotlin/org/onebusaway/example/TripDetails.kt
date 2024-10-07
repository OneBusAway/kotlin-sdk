package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.errors.OnebusawaySdkException
import org.onebusaway.models.*

object TripDetails {

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
       try {
           // Define the trip ID
           val tripId = "40_608344966"

           // Create the parameters for the trip details request
           val params = TripDetailRetrieveParams.builder()
               .tripId(tripId)
               .build()

           // Retrieve the trip details
           val tripDetails: TripDetailRetrieveResponse = client.tripDetails().retrieve(params)

           println(tripDetails)
       }
         catch (onebusawayException: OnebusawaySdkException) {
              println(onebusawayException)
         }
    }
}

package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.*

object RoutesForLocation {

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
            // Define the location parameters
            val lat = 47.653435
            val lon = -122.305641
            val radius = 1000.0

            // Create the parameters for the routes for location request
            val params = RoutesForLocationListParams.builder()
                .lat(lat)
                .lon(lon)
                .radius(radius)
                .build()

            // Retrieve the routes for location
            val routesForLocation: RoutesForLocationListResponse = client.routesForLocation().list(params)

            for (route in routesForLocation.data().list()) {
                println(route)
            }
        } catch (e: Exception) {
            System.err.println("Error occurred: ${e.message}")
        }
    }
}

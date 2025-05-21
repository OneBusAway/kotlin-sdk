package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.stopsforroute.StopsForRouteListParams
import org.onebusaway.models.stopsforroute.StopsForRouteListResponse

object StopsForRoute {

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
        // Define the route ID
        val routeId = "1_100229"

        // Build request parameters for fetching stops for the route
        val params = StopsForRouteListParams.builder().routeId(routeId).build()

        // Get the stops for the route
        val stops: StopsForRouteListResponse = client.stopsForRoute().list(params)

        println(stops)
    }
}

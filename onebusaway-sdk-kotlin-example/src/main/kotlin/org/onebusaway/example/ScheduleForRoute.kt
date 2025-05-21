package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.errors.OnebusawaySdkServiceException
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveParams
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveResponse

object ScheduleForRoute {

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
        val routeId = "1_100223"

        try {
            // Define the parameters for the schedule for route request
            val params = ScheduleForRouteRetrieveParams.builder()
                .routeId(routeId)
                .build()

            // Retrieve the schedule for the route
            val scheduleForRoute: ScheduleForRouteRetrieveResponse = client.scheduleForRoute().retrieve(params)

            println(scheduleForRoute)

        } catch (e: OnebusawaySdkServiceException) {
            // Handle HTTP errors
            System.err.println("Error occurred: ${e.message}")
            System.err.println("Status Code: ${e.statusCode()}")
        } catch (e: Exception) {
            // Handle general errors
            System.err.println("Error occurred: ${e.message}")
        }
    }
}

package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.errors.OnebusawaySdkServiceException
import org.onebusaway.models.*

object Route {

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
        val routeId = "1_100224"

        try {
            val params = RouteRetrieveParams.builder().routeId(routeId).build()

            val route: RouteRetrieveResponse = client.route().retrieve(params)

            println(route)

        } catch (e: OnebusawaySdkServiceException) {
            // Handle the SDK-specific service exception
            System.err.println("Error occurred: ${e.message}")
            System.err.println("Status Code: ${e.statusCode()}")
        }
    }
}

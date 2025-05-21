package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.errors.OnebusawaySdkServiceException
import org.onebusaway.models.routesforagency.RoutesForAgencyListParams
import org.onebusaway.models.routesforagency.RoutesForAgencyListResponse

object RouteForAgency {

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
            // Define the agency ID
            val agencyId = "1"

            // Create the parameters for the routes for agency list request
            val params = RoutesForAgencyListParams.builder()
                .agencyId(agencyId)
                .build()

            // Retrieve the routes for the agency
            val routesForAgency: RoutesForAgencyListResponse = client.routesForAgency().list(params)

            for (route in routesForAgency.data().list()) {
                println(route)
            }
        } catch (e: OnebusawaySdkServiceException) {
            // Handle the SDK-specific service exception
            System.err.println("Error occurred: ${e.message}")
            System.err.println("Status Code: ${e.statusCode()}")
        } catch (e: Exception) {
            System.err.println("Error occurred: ${e.message}")
        }
    }
}

package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.searchforroute.SearchForRouteListParams
import org.onebusaway.models.searchforroute.SearchForRouteListResponse

object SearchForRoute {

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
        // Define the search input
        val searchInput = "crysta"

        // Create the parameters for the route search request
        val params = SearchForRouteListParams.builder()
            .input(searchInput)
            .build()

        // Retrieve the route search results
        val searchForRouteListResponse: SearchForRouteListResponse = client.searchForRoute().list(params)

        println(searchForRouteListResponse)
    }
}

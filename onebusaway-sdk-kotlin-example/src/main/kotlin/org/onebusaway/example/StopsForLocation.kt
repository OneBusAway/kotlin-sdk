package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.*
import org.onebusaway.models.stopsforlocation.StopsForLocationListParams
import org.onebusaway.models.stopsforlocation.StopsForLocationListResponse

object StopsForLocation {

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
        // Define location parameters (example: Space Needle)
        val lat = 47.6205
        val lon = -122.3493
        val radius = 500.0

        // Build request parameters for fetching stops
        val params = StopsForLocationListParams.builder()
            .lat(lat)
            .lon(lon)
            .radius(radius)
            .build()

        // Fetch stops for the given location
        val response: StopsForLocationListResponse = client.stopsForLocation().list(params)

        // Extract the data and references from the response
        val data = response.data()
        val references = data.references()
        val stops = data.list()

        // Create a map to reference routes by their IDs for faster lookup
        val referenceMap: MutableMap<String, References.Route> = mutableMapOf()
        for (route in references.routes()) {
            referenceMap[route.id()] = route
        }

        // Print information for each stop
        for (stop in stops) {
            println("${stop.name()} (${stop.lat()}, ${stop.lon()})")
            println("  Routes:")

            // For each stop, print associated routes
            for (routeId in stop.routeIds()) {
                val route = referenceMap[routeId] ?: continue  // Skip if route is not found

                // Build a description for the route
                val routeDescription = buildRouteDescription(route)
                println("    $routeDescription")
            }

            println()
        }
    }

    // Helper method to build the route description using optional values
    private fun buildRouteDescription(route: References.Route): String {
        val description = StringBuilder()

        // Append short name if present
        route.shortName()?.let { description.append(it) }

        // Append description if present
        route.description()?.let { desc ->
            if (description.isNotEmpty()) {
                description.append(" - ")
            }
            description.append(desc)
        }

        return description.toString()
    }
}

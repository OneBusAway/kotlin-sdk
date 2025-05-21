package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListParams
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListResponse

object StopsIdsForAgency {

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
        // Define the agency ID
        val agencyId = "1"

        // Build request parameters for fetching stop IDs for the agency
        val params = StopIdsForAgencyListParams.builder().agencyId(agencyId).build()

        // Get the list of stop IDs for the agency
        val stopIds: StopIdsForAgencyListResponse = client.stopIdsForAgency().list(params)

        for (stopId in stopIds.data().list()) {
            println(stopId)
        }
    }
}

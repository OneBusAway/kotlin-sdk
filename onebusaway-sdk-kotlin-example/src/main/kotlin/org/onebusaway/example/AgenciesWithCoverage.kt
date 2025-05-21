package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListParams
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListResponse

object AgenciesWithCoverage {

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
        // Define the required Params
        val params = AgenciesWithCoverageListParams.builder().build()

        // Get the agencies with coverage
        val agencies: AgenciesWithCoverageListResponse = client.agenciesWithCoverage().list(params)

        for (agency in agencies.data().list()) {
            println(agency)
        }
    }
}

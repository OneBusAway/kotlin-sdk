package org.onebusaway.example

import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.errors.OnebusawaySdkServiceException
import org.onebusaway.models.block.BlockRetrieveParams
import org.onebusaway.models.block.BlockRetrieveResponse

object Block {

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
        // Define the block ID
        val blockId = "1_7331695"

        try {
            // Define the parameters for the block retrieval request
            val params = BlockRetrieveParams.builder().blockId(blockId).build()

            // Retrieve the block information
            val block: BlockRetrieveResponse = client.block().retrieve(params)

            println(block)

        } catch (e: OnebusawaySdkServiceException) {
            // Handle the SDK-specific service exception
            println("Error occurred: ${e.message}")
            println("Status Code: ${e.statusCode()}")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

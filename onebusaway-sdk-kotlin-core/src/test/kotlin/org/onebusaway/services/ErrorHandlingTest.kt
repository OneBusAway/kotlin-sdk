// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.core.JsonValue
import org.onebusaway.core.http.Headers
import org.onebusaway.core.jsonMapper
import org.onebusaway.errors.BadRequestException
import org.onebusaway.errors.InternalServerException
import org.onebusaway.errors.NotFoundException
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.errors.OnebusawaySdkException
import org.onebusaway.errors.PermissionDeniedException
import org.onebusaway.errors.RateLimitException
import org.onebusaway.errors.UnauthorizedException
import org.onebusaway.errors.UnexpectedStatusCodeException
import org.onebusaway.errors.UnprocessableEntityException

@WireMockTest
class ErrorHandlingTest {

    companion object {

        private val ERROR: OnebusawaySdkError =
            OnebusawaySdkError.builder()
                .putAdditionalProperty("errorProperty", JsonValue.from("42"))
                .build()

        private val ERROR_JSON: ByteArray = jsonMapper().writeValueAsBytes(ERROR)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: OnebusawaySdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun currentTimeRetrieve400() {
        val currentTimeService = client.currentTime()
        stubFor(
            get(anyUrl())
                .willReturn(status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e = assertThrows<BadRequestException> { currentTimeService.retrieve() }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun currentTimeRetrieve401() {
        val currentTimeService = client.currentTime()
        stubFor(
            get(anyUrl())
                .willReturn(status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e = assertThrows<UnauthorizedException> { currentTimeService.retrieve() }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun currentTimeRetrieve403() {
        val currentTimeService = client.currentTime()
        stubFor(
            get(anyUrl())
                .willReturn(status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e = assertThrows<PermissionDeniedException> { currentTimeService.retrieve() }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun currentTimeRetrieve404() {
        val currentTimeService = client.currentTime()
        stubFor(
            get(anyUrl())
                .willReturn(status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e = assertThrows<NotFoundException> { currentTimeService.retrieve() }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun currentTimeRetrieve422() {
        val currentTimeService = client.currentTime()
        stubFor(
            get(anyUrl())
                .willReturn(status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e = assertThrows<UnprocessableEntityException> { currentTimeService.retrieve() }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun currentTimeRetrieve429() {
        val currentTimeService = client.currentTime()
        stubFor(
            get(anyUrl())
                .willReturn(status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e = assertThrows<RateLimitException> { currentTimeService.retrieve() }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun currentTimeRetrieve500() {
        val currentTimeService = client.currentTime()
        stubFor(
            get(anyUrl())
                .willReturn(status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e = assertThrows<InternalServerException> { currentTimeService.retrieve() }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun currentTimeRetrieve999() {
        val currentTimeService = client.currentTime()
        stubFor(
            get(anyUrl())
                .willReturn(status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e = assertThrows<UnexpectedStatusCodeException> { currentTimeService.retrieve() }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun currentTimeRetrieveInvalidJsonBody() {
        val currentTimeService = client.currentTime()
        stubFor(
            get(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e = assertThrows<OnebusawaySdkException> { currentTimeService.retrieve() }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
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
import org.onebusaway.models.CurrentTimeRetrieveParams
import org.onebusaway.models.CurrentTimeRetrieveResponse

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val ONEBUSAWAY_SDK_ERROR: OnebusawaySdkError =
        OnebusawaySdkError.builder().putAdditionalProperty("key", JsonValue.from("value")).build()

    private lateinit var client: OnebusawaySdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun currentTimesRetrieve200() {
        val params = CurrentTimeRetrieveParams.builder().build()

        val expected =
            CurrentTimeRetrieveResponse.builder()
                .putAdditionalProperty("code", JsonValue.from(0))
                .putAdditionalProperty("currentTime", JsonValue.from(0))
                .putAdditionalProperty("text", JsonValue.from("text"))
                .putAdditionalProperty("version", JsonValue.from(0))
                .putAdditionalProperty(
                    "data",
                    JsonValue.from(
                        mapOf(
                            "entry" to mapOf("readableTime" to "readableTime", "time" to 0),
                            "references" to
                                mapOf(
                                    "agencies" to
                                        listOf(
                                            mapOf(
                                                "id" to "id",
                                                "name" to "name",
                                                "timezone" to "timezone",
                                                "url" to "url",
                                                "disclaimer" to "disclaimer",
                                                "email" to "email",
                                                "fareUrl" to "fareUrl",
                                                "lang" to "lang",
                                                "phone" to "phone",
                                                "privateService" to true,
                                            )
                                        ),
                                    "routes" to
                                        listOf(
                                            mapOf(
                                                "id" to "id",
                                                "agencyId" to "agencyId",
                                                "type" to 0,
                                                "color" to "color",
                                                "description" to "description",
                                                "longName" to "longName",
                                                "nullSafeShortName" to "nullSafeShortName",
                                                "shortName" to "shortName",
                                                "textColor" to "textColor",
                                                "url" to "url",
                                            )
                                        ),
                                    "situations" to
                                        listOf(
                                            mapOf(
                                                "id" to "id",
                                                "creationTime" to 0,
                                                "activeWindows" to
                                                    listOf(mapOf("from" to 0, "to" to 0)),
                                                "allAffects" to
                                                    listOf(
                                                        mapOf(
                                                            "agencyId" to "agencyId",
                                                            "applicationId" to "applicationId",
                                                            "directionId" to "directionId",
                                                            "routeId" to "routeId",
                                                            "stopId" to "stopId",
                                                            "tripId" to "tripId",
                                                        )
                                                    ),
                                                "consequenceMessage" to "consequenceMessage",
                                                "consequences" to
                                                    listOf(
                                                        mapOf(
                                                            "condition" to "condition",
                                                            "conditionDetails" to
                                                                mapOf(
                                                                    "diversionPath" to
                                                                        mapOf(
                                                                            "length" to 0,
                                                                            "levels" to "levels",
                                                                            "points" to "points",
                                                                        ),
                                                                    "diversionStopIds" to
                                                                        listOf("string")
                                                                )
                                                        )
                                                    ),
                                                "description" to
                                                    mapOf("lang" to "lang", "value" to "value"),
                                                "publicationWindows" to
                                                    listOf(mapOf("from" to 0, "to" to 0)),
                                                "reason" to "equipmentReason",
                                                "severity" to "severity",
                                                "summary" to
                                                    mapOf("lang" to "lang", "value" to "value"),
                                                "url" to
                                                    mapOf("lang" to "lang", "value" to "value"),
                                            )
                                        ),
                                    "stops" to
                                        listOf(
                                            mapOf(
                                                "id" to "id",
                                                "lat" to 0,
                                                "lon" to 0,
                                                "name" to "name",
                                                "parent" to "parent",
                                                "routeIds" to listOf("string"),
                                                "staticRouteIds" to listOf("string"),
                                                "code" to "code",
                                                "direction" to "direction",
                                                "locationType" to 0,
                                                "wheelchairBoarding" to "wheelchairBoarding",
                                            )
                                        ),
                                    "stopTimes" to
                                        listOf(
                                            mapOf(
                                                "arrivalTime" to 0,
                                                "departureTime" to 0,
                                                "distanceAlongTrip" to 0,
                                                "historicalOccupancy" to "historicalOccupancy",
                                                "stopHeadsign" to "stopHeadsign",
                                                "stopId" to "stopId",
                                            )
                                        ),
                                    "trips" to
                                        listOf(
                                            mapOf(
                                                "id" to "id",
                                                "routeId" to "routeId",
                                                "serviceId" to "serviceId",
                                                "blockId" to "blockId",
                                                "directionId" to "directionId",
                                                "peakOffpeak" to 0,
                                                "routeShortName" to "routeShortName",
                                                "shapeId" to "shapeId",
                                                "timeZone" to "timeZone",
                                                "tripHeadsign" to "tripHeadsign",
                                                "tripShortName" to "tripShortName",
                                            )
                                        ),
                                )
                        )
                    )
                )
                .build()

        stubFor(get(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.currentTime().retrieve(params)).isEqualTo(expected)
    }

    @Test
    fun currentTimesRetrieve400() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ONEBUSAWAY_SDK_ERROR
                )
            })
    }

    @Test
    fun currentTimesRetrieve401() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertUnauthorized(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ONEBUSAWAY_SDK_ERROR
                )
            })
    }

    @Test
    fun currentTimesRetrieve403() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ONEBUSAWAY_SDK_ERROR
                )
            })
    }

    @Test
    fun currentTimesRetrieve404() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), ONEBUSAWAY_SDK_ERROR)
            })
    }

    @Test
    fun currentTimesRetrieve422() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ONEBUSAWAY_SDK_ERROR
                )
            })
    }

    @Test
    fun currentTimesRetrieve429() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertRateLimit(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ONEBUSAWAY_SDK_ERROR
                )
            })
    }

    @Test
    fun currentTimesRetrieve500() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertInternalServer(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ONEBUSAWAY_SDK_ERROR
                )
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(ONEBUSAWAY_SDK_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(OnebusawaySdkException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().build(), OnebusawaySdkError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: OnebusawaySdkError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: OnebusawaySdkError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.core.JsonValue
import org.onebusaway.core.jsonMapper
import org.onebusaway.models.*

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: OnebusawaySdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OnebusawaySdkOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun currentTimesRetrieveWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            CurrentTimeRetrieveParams.builder()
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
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

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.currentTime().retrieve(params)

        verify(getRequestedFor(anyUrl()))
    }
}

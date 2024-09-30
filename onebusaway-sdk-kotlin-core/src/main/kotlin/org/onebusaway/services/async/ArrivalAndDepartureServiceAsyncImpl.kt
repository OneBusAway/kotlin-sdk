// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.ArrivalAndDepartureListParams
import org.onebusaway.models.ArrivalAndDepartureListResponse
import org.onebusaway.models.ArrivalAndDepartureRetrieveParams
import org.onebusaway.models.ArrivalAndDepartureRetrieveResponse
import org.onebusaway.services.errorHandler
import org.onebusaway.services.jsonHandler
import org.onebusaway.services.withErrorHandler

class ArrivalAndDepartureServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ArrivalAndDepartureServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ArrivalAndDepartureRetrieveResponse> =
        jsonHandler<ArrivalAndDepartureRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** arrival-and-departure-for-stop */
    override suspend fun retrieve(
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions
    ): ArrivalAndDepartureRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "arrival-and-departure-for-stop", "{stopID}.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ArrivalAndDepartureListResponse> =
        jsonHandler<ArrivalAndDepartureListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** arrivals-and-departures-for-stop */
    override suspend fun list(
        params: ArrivalAndDepartureListParams,
        requestOptions: RequestOptions
    ): ArrivalAndDepartureListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "where",
                    "arrivals-and-departures-for-stop",
                    "{stopID}.json"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
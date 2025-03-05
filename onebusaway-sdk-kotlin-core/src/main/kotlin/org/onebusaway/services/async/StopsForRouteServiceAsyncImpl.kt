// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.core.http.parseable
import org.onebusaway.core.prepareAsync
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.StopsForRouteListParams
import org.onebusaway.models.StopsForRouteListResponse

class StopsForRouteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StopsForRouteServiceAsync {

    private val withRawResponse: StopsForRouteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StopsForRouteServiceAsync.WithRawResponse = withRawResponse

    override suspend fun list(
        params: StopsForRouteListParams,
        requestOptions: RequestOptions,
    ): StopsForRouteListResponse =
        // get /api/where/stops-for-route/{routeID}.json
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StopsForRouteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OnebusawaySdkError> =
            errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<StopsForRouteListResponse> =
            jsonHandler<StopsForRouteListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: StopsForRouteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopsForRouteListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "where",
                        "stops-for-route",
                        "${params.getPathParam(0)}.json",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

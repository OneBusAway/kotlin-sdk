// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

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
import org.onebusaway.core.prepare
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.TripDetailRetrieveParams
import org.onebusaway.models.TripDetailRetrieveResponse

class TripDetailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TripDetailService {

    private val withRawResponse: TripDetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TripDetailService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions,
    ): TripDetailRetrieveResponse =
        // get /api/where/trip-details/{tripID}.json
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TripDetailService.WithRawResponse {

        private val errorHandler: Handler<OnebusawaySdkError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<TripDetailRetrieveResponse> =
            jsonHandler<TripDetailRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: TripDetailRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripDetailRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "where",
                        "trip-details",
                        "${params.getPathParam(0)}.json",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

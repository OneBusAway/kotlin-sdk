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
import org.onebusaway.models.ScheduleForStopRetrieveParams
import org.onebusaway.models.ScheduleForStopRetrieveResponse

class ScheduleForStopServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ScheduleForStopServiceAsync {

    private val withRawResponse: ScheduleForStopServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScheduleForStopServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: ScheduleForStopRetrieveParams,
        requestOptions: RequestOptions,
    ): ScheduleForStopRetrieveResponse =
        // get /api/where/schedule-for-stop/{stopID}.json
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduleForStopServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OnebusawaySdkError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ScheduleForStopRetrieveResponse> =
            jsonHandler<ScheduleForStopRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ScheduleForStopRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleForStopRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "where",
                        "schedule-for-stop",
                        "${params.getPathParam(0)}.json",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

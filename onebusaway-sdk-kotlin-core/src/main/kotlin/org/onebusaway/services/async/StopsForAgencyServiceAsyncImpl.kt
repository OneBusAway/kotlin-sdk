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
import org.onebusaway.models.StopsForAgencyListParams
import org.onebusaway.models.StopsForAgencyListResponse

class StopsForAgencyServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : StopsForAgencyServiceAsync {

    private val withRawResponse: StopsForAgencyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StopsForAgencyServiceAsync.WithRawResponse = withRawResponse

    override suspend fun list(
        params: StopsForAgencyListParams,
        requestOptions: RequestOptions,
    ): StopsForAgencyListResponse =
        // get /api/where/stops-for-agency/{agencyID}.json
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StopsForAgencyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OnebusawaySdkError> =
            errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<StopsForAgencyListResponse> =
            jsonHandler<StopsForAgencyListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: StopsForAgencyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopsForAgencyListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "where",
                        "stops-for-agency",
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

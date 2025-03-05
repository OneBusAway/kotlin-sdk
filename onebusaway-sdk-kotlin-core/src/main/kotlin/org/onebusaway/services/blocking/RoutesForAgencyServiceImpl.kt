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
import org.onebusaway.models.RoutesForAgencyListParams
import org.onebusaway.models.RoutesForAgencyListResponse

class RoutesForAgencyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RoutesForAgencyService {

    private val withRawResponse: RoutesForAgencyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoutesForAgencyService.WithRawResponse = withRawResponse

    override fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions,
    ): RoutesForAgencyListResponse =
        // get /api/where/routes-for-agency/{agencyID}.json
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoutesForAgencyService.WithRawResponse {

        private val errorHandler: Handler<OnebusawaySdkError> =
            errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<RoutesForAgencyListResponse> =
            jsonHandler<RoutesForAgencyListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: RoutesForAgencyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutesForAgencyListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "where",
                        "routes-for-agency",
                        "${params.getPathParam(0)}.json",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.JsonValue
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.checkRequired
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.core.http.parseable
import org.onebusaway.core.prepareAsync
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListParams
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListResponse

class StopIdsForAgencyServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : StopIdsForAgencyServiceAsync {

    private val withRawResponse: StopIdsForAgencyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StopIdsForAgencyServiceAsync.WithRawResponse = withRawResponse

    override suspend fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions,
    ): StopIdsForAgencyListResponse =
        // get /api/where/stop-ids-for-agency/{agencyID}.json
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StopIdsForAgencyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<StopIdsForAgencyListResponse> =
            jsonHandler<StopIdsForAgencyListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: StopIdsForAgencyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopIdsForAgencyListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agencyId", params.agencyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "where",
                        "stop-ids-for-agency",
                        "${params._pathParam(0)}.json",
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

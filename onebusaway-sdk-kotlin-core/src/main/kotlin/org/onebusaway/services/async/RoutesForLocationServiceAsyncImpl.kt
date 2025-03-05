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
import org.onebusaway.core.prepareAsync
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.RoutesForLocationListParams
import org.onebusaway.models.RoutesForLocationListResponse

class RoutesForLocationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RoutesForLocationServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<RoutesForLocationListResponse> =
        jsonHandler<RoutesForLocationListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** routes-for-location */
    override suspend fun list(
        params: RoutesForLocationListParams,
        requestOptions: RequestOptions,
    ): RoutesForLocationListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "routes-for-location.json")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}

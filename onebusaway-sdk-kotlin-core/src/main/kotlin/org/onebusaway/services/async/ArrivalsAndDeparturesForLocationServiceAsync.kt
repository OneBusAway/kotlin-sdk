// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.arrivalsanddeparturesforlocation.ArrivalsAndDeparturesForLocationListParams
import org.onebusaway.models.arrivalsanddeparturesforlocation.ArrivalsAndDeparturesForLocationListResponse

interface ArrivalsAndDeparturesForLocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): ArrivalsAndDeparturesForLocationServiceAsync

    /**
     * Returns real-time arrival and departure data for stops within a bounding box or radius
     * centered on a specific location.
     */
    suspend fun list(
        params: ArrivalsAndDeparturesForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalsAndDeparturesForLocationListResponse

    /**
     * A view of [ArrivalsAndDeparturesForLocationServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ArrivalsAndDeparturesForLocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/where/arrivals-and-departures-for-location.json`, but is otherwise the same as
         * [ArrivalsAndDeparturesForLocationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ArrivalsAndDeparturesForLocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalsAndDeparturesForLocationListResponse>
    }
}

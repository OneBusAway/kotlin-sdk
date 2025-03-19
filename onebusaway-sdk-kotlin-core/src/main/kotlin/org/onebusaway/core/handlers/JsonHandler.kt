@file:JvmName("JsonHandler")

package org.onebusaway.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.onebusaway.core.enhanceJacksonException
import org.onebusaway.core.http.HttpResponse
import org.onebusaway.core.http.HttpResponse.Handler

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw enhanceJacksonException("Error reading response", e)
            }
        }
    }

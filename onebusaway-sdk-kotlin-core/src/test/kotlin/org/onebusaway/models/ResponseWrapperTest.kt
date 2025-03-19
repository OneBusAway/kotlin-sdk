// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseWrapperTest {

    @Test
    fun create() {
        val responseWrapper =
            ResponseWrapper.builder().code(0L).currentTime(0L).text("text").version(0L).build()

        assertThat(responseWrapper.code()).isEqualTo(0L)
        assertThat(responseWrapper.currentTime()).isEqualTo(0L)
        assertThat(responseWrapper.text()).isEqualTo("text")
        assertThat(responseWrapper.version()).isEqualTo(0L)
    }
}

package com.open_transit.api.errors

open class OnebusawaySdkException constructor(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)

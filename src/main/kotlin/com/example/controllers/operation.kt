package com.example.controllers

import com.example.model.OperationRequestBody
import com.example.model.OperationResponseBody
import com.example.service.OperationService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/operation")
open class Operation {
    private val service = OperationService()

    @Post(uri = "/add", consumes = [MediaType.APPLICATION_JSON], produces = [MediaType.APPLICATION_JSON])
    fun add(@Body body: OperationRequestBody): HttpResponse<OperationResponseBody> {

        return HttpResponse.ok(service.add(body))
    }

    @Post(uri = "/subtract")
    fun subtract(@Body body: OperationRequestBody): HttpResponse<OperationResponseBody>? {
        return HttpResponse.ok(service.subtract(body))
    }
}
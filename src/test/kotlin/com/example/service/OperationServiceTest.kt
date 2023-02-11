package com.example.service

import com.example.model.OperationRequestBody
import com.example.model.OperationResponseBody
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OperationServiceTest {

    @Test
    fun `should be able to add`() {
        // 1) arrange   2) act    3) assert
        val dummyRequestBody = OperationRequestBody()
        dummyRequestBody.value1 = 1
        dummyRequestBody.value2 = 5
        val operationService = OperationService()

        val actualResponseBody = operationService.add(dummyRequestBody)
        val expectedResponseBody = OperationResponseBody("result of addition is 6")

        assertEquals(actualResponseBody, expectedResponseBody)
    }

    @Test
    fun `should be able to subract`() {
        // 1) arrange   2) act    3) assert
        val dummyRequestBody = OperationRequestBody()
        dummyRequestBody.value1 = 23
        dummyRequestBody.value2 = 21
        val operationService = OperationService()

        val actualResponseBody = operationService.subtract(dummyRequestBody)
        val expectedResponseBody = OperationResponseBody("result of subtract is 2")

        assertEquals(actualResponseBody, expectedResponseBody)

    }
}
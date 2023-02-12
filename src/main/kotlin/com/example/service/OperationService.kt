package com.example.service

import com.example.model.OperationRequestBody
import com.example.model.OperationResponseBody

class OperationService {
    fun add(operationRequestBody: OperationRequestBody): OperationResponseBody {
        val valueToAdd1 = operationRequestBody.value1
        val valueToAdd2 = operationRequestBody.value2
        val result = valueToAdd1!! + valueToAdd2!!
        return OperationResponseBody("result of addition is $result")

    }

    fun subtract(operationRequestBody: OperationRequestBody): OperationResponseBody {
        val valueToAdd1 = operationRequestBody.value1
        val valueToAdd2 = operationRequestBody.value2
        val result = valueToAdd1!! - valueToAdd2!!
        return OperationResponseBody("result of subtract is $result")
    }


}
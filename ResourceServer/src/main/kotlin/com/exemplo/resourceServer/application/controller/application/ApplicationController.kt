package com.exemplo.resourceServer.application.controller.application

import com.exemplo.resourceServer.application.controller.application.request.CreateApplicationRequest
import com.exemplo.resourceServer.application.controller.application.response.CreateApplicationResponse
import com.exemplo.resourceServer.application.usecase.application.CreateApplicationUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/application")
class ApplicationController {

    @Autowired
    lateinit var createApplicationUseCase: CreateApplicationUseCase

    @PostMapping
    fun createApplication(
        @RequestBody request: CreateApplicationRequest
    ): ResponseEntity<CreateApplicationResponse> {
        val application = createApplicationUseCase.execute(request)
        return ResponseEntity.ok().body(CreateApplicationResponse(applicationId = application.id))
    }
}
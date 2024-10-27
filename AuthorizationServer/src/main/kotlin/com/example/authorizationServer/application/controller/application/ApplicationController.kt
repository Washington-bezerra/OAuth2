package com.example.authorizationServer.application.controller.application

import com.example.authorizationServer.application.controller.application.request.CreateApplicationRequest
import com.example.authorizationServer.application.controller.application.response.CreateApplicationResponse
import com.example.authorizationServer.application.usecase.application.CreateApplicationUseCase
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
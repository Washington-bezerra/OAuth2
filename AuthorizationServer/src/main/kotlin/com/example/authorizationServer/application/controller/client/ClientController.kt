package com.example.authorizationServer.application.controller.client

import com.example.authorizationServer.application.controller.client.request.CreateClientRequest
import com.example.authorizationServer.application.controller.client.response.CreateClientResponse
import com.example.authorizationServer.application.usecase.client.CreateClientUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/client")
class ClientController {

    @Autowired
    lateinit var createClientUseCase: CreateClientUseCase

    @PostMapping
    fun createClient(
        @RequestBody request: CreateClientRequest
    ): ResponseEntity<CreateClientResponse> {
        val client = createClientUseCase.execute(request)
        return ResponseEntity.ok().body(CreateClientResponse(clientId = client.id, secretId = client.secretId))
    }
}
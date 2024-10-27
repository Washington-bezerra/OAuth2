package com.example.authorizationServer.mapper.client

import com.example.authorizationServer.application.controller.client.request.CreateClientRequest
import com.example.authorizationServer.infra.entity.client.Client

class ClientMapper {

    fun toCreateClientEntity(request: CreateClientRequest): Client {
        return Client(
            companyId = request.companyId,
            applicationId = request.applicationId,
            isActive = true,
            permittedAccessTo = request.permittedAccessTo
        )
    }
}
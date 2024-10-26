package com.exemplo.resourceServer.boudaries.mapper.client

import com.exemplo.resourceServer.application.controller.client.request.CreateClientRequest
import com.exemplo.resourceServer.infra.entity.client.Client

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
package com.example.authorizationServer.mapper.application

import com.example.authorizationServer.application.controller.application.request.CreateApplicationRequest
import com.example.authorizationServer.infra.entity.application.Application

class ApplicationMapper {

    fun toCreationApplicationEntity(request: CreateApplicationRequest): Application {
        return Application(
            name = request.name,
            companyId = request.companyId,
            isActive = true
        )
    }
}
package com.exemplo.resourceServer.boudaries.mapper.application

import com.exemplo.resourceServer.application.controller.application.request.CreateApplicationRequest
import com.exemplo.resourceServer.infra.entity.application.Application

class ApplicationMapper {

    fun toCreationApplicationEntity(request: CreateApplicationRequest): Application {
        return Application(
            name = request.name,
            companyId = request.companyId,
            isActive = true
        )
    }
}
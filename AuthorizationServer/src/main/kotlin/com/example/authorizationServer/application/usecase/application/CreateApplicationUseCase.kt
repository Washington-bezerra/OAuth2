package com.example.authorizationServer.application.usecase.application

import com.example.authorizationServer.application.controller.application.request.CreateApplicationRequest
import com.example.authorizationServer.mapper.application.ApplicationMapper
import com.example.authorizationServer.infra.entity.application.Application
import com.example.authorizationServer.infra.repository.application.ApplicationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CreateApplicationUseCase {

    val applicationMapper: ApplicationMapper = ApplicationMapper()
    @Autowired
    lateinit var applicationRepository: ApplicationRepository

    fun execute(request: CreateApplicationRequest): Application {
        val application = applicationMapper.toCreationApplicationEntity(request)
        return applicationRepository.save(application)
    }

}
package com.exemplo.resourceServer.application.usecase.application

import com.exemplo.resourceServer.application.controller.application.request.CreateApplicationRequest
import com.exemplo.resourceServer.boudaries.mapper.application.ApplicationMapper
import com.exemplo.resourceServer.infra.entity.application.Application
import com.exemplo.resourceServer.infra.repository.application.ApplicationRepository
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
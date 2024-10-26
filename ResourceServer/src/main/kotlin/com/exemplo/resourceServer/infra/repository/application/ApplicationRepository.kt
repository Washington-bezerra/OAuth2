package com.exemplo.resourceServer.infra.repository.application

import com.exemplo.resourceServer.infra.entity.application.Application
import org.springframework.data.mongodb.repository.MongoRepository

interface ApplicationRepository : MongoRepository<Application, String> {}
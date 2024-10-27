package com.example.authorizationServer.infra.repository.application

import com.example.authorizationServer.infra.entity.application.Application
import org.springframework.data.mongodb.repository.MongoRepository

interface ApplicationRepository : MongoRepository<Application, String> {}
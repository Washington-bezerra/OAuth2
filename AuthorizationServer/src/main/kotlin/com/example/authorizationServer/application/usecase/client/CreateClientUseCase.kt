package com.example.authorizationServer.application.usecase.client

import com.example.authorizationServer.application.controller.client.request.CreateClientRequest
import com.example.authorizationServer.mapper.client.ClientMapper
import com.example.authorizationServer.infra.entity.client.Client
import com.example.authorizationServer.infra.repository.client.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateClientUseCase {

    val clientMapper: ClientMapper = ClientMapper()
    @Autowired
    lateinit var clientRepository: ClientRepository

    fun execute(request: CreateClientRequest): Client {
        val company = clientMapper.toCreateClientEntity(request)
        return clientRepository.save(company)
    }
}
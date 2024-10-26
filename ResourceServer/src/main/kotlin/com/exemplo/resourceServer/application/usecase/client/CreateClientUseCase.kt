package com.exemplo.resourceServer.application.usecase.client

import com.exemplo.resourceServer.application.controller.client.request.CreateClientRequest
import com.exemplo.resourceServer.application.controller.company.request.CreateCompanyRequest
import com.exemplo.resourceServer.boudaries.mapper.client.ClientMapper
import com.exemplo.resourceServer.boudaries.mapper.company.CompanyMapper
import com.exemplo.resourceServer.infra.entity.client.Client
import com.exemplo.resourceServer.infra.entity.company.Company
import com.exemplo.resourceServer.infra.repository.client.ClientRepository
import com.exemplo.resourceServer.infra.repository.company.CompanyRepository
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
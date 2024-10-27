package com.example.authorizationServer.application.usecase.company

import com.example.authorizationServer.application.controller.company.request.CreateCompanyRequest
import com.example.authorizationServer.mapper.company.CompanyMapper
import com.example.authorizationServer.infra.entity.company.Company
import com.example.authorizationServer.infra.repository.company.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateCompanyUseCase {

    val companyMapper: CompanyMapper = CompanyMapper()
    @Autowired
    lateinit var companyRepository: CompanyRepository

    fun execute(request: CreateCompanyRequest): Company {
        val company = companyMapper.toCreationCompanyEntity(request)
        return companyRepository.save(company)
    }
}
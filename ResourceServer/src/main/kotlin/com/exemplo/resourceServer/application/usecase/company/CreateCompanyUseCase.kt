package com.exemplo.resourceServer.application.usecase.company

import com.exemplo.resourceServer.application.controller.company.request.CreateCompanyRequest
import com.exemplo.resourceServer.boudaries.mapper.company.CompanyMapper
import com.exemplo.resourceServer.infra.entity.company.Company
import com.exemplo.resourceServer.infra.repository.company.CompanyRepository
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
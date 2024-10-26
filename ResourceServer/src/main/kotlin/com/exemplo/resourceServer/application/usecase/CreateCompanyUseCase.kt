package com.exemplo.resourceServer.application.usecase

import com.exemplo.resourceServer.application.controller.request.CreateCompanyRequest
import com.exemplo.resourceServer.boudaries.mapper.CompanyMapper
import com.exemplo.resourceServer.infra.entity.Company
import com.exemplo.resourceServer.infra.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateCompanyUseCase {

    val companyMapper: CompanyMapper = CompanyMapper()
    @Autowired
    lateinit var companyRepository: CompanyRepository

    fun execute(request: CreateCompanyRequest): Company {
        val company = companyMapper.toCreationCompanyEntity(request)
        val a = companyRepository.save(company)
        return a
    }
}
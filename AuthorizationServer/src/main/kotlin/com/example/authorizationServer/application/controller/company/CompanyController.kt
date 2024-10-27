package com.example.authorizationServer.application.controller.company

import com.example.authorizationServer.application.controller.company.request.CreateCompanyRequest
import com.example.authorizationServer.application.controller.company.response.CreateCompanyResponse
import com.example.authorizationServer.application.usecase.company.CreateCompanyUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/company")
class CompanyController {

    @Autowired
    lateinit var createCompanyUseCase: CreateCompanyUseCase

    @PostMapping()
    fun createCompany(
        @RequestBody request: CreateCompanyRequest
    ): ResponseEntity<CreateCompanyResponse> {
        val company = createCompanyUseCase.execute(request)
        return ResponseEntity.ok().body(CreateCompanyResponse(companyId = company.id))
    }
}
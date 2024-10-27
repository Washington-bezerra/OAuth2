package com.example.authorizationServer.mapper.company

import com.example.authorizationServer.application.controller.company.request.CreateCompanyRequest
import com.example.authorizationServer.infra.entity.company.Company
import com.example.authorizationServer.infra.entity.company.Contact
import java.util.UUID

class CompanyMapper {

    fun toCreationCompanyEntity(response: CreateCompanyRequest): Company {
        return Company(
            id = UUID.randomUUID().toString(),
            name = response.name,
            cnpj = response.cnpj,
            contact = Contact(
                email = response.contact.email,
                phone = response.contact.phone
            ),
            isActive = true
        )

    }
}
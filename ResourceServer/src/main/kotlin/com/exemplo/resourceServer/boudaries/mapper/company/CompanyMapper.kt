package com.exemplo.resourceServer.boudaries.mapper.company

import com.exemplo.resourceServer.application.controller.company.request.CreateCompanyRequest
import com.exemplo.resourceServer.infra.entity.company.Company
import com.exemplo.resourceServer.infra.entity.company.Contact
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
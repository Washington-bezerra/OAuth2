package com.exemplo.resourceServer.boudaries.mapper

import com.exemplo.resourceServer.application.controller.request.CreateCompanyRequest
import com.exemplo.resourceServer.infra.entity.Company
import com.exemplo.resourceServer.infra.entity.Contact
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
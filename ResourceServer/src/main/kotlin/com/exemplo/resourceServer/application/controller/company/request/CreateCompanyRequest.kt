package com.exemplo.resourceServer.application.controller.company.request

data class ContactRequest (
    val email: String,
    val phone: String
)

data class CreateCompanyRequest(
    val name: String,
    val cnpj: String,
    val contact: ContactRequest
)

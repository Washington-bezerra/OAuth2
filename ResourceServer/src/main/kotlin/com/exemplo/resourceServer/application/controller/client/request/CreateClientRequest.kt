package com.exemplo.resourceServer.application.controller.client.request

data class CreateClientRequest(
    val companyId: String,
    val applicationId: String,
    val permittedAccessTo: String,
)

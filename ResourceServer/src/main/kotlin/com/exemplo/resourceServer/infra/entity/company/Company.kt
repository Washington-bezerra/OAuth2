package com.exemplo.resourceServer.infra.entity.company

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document
data class Company(
    @Id
    val id: String,
    val name: String,
    val cnpj: String,
    val contact: Contact,
    val isActive: Boolean,
    val createdAt: Long = Instant.now().epochSecond
)

@Document
data class Contact (
    val email: String,
    val phone: String
)

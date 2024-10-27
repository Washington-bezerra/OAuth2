package com.example.authorizationServer.infra.entity.client

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.UUID

@Document
data class Client(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val companyId: String,
    val applicationId: String,
    val permittedAccessTo: String,
    val secretId: String = UUID.randomUUID().toString(),
    val isActive: Boolean,
    val createdAt: Long = Instant.now().epochSecond
)

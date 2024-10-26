package com.exemplo.resourceServer.infra.entity.application

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.*

@Document
data class Application (
    @Id
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val companyId: String,
    val isActive: Boolean,
    val createdAt: Long = Instant.now().epochSecond
)
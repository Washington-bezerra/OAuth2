package com.exemplo.resourceServer.infra.repository

import com.exemplo.resourceServer.infra.entity.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {}
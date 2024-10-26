package com.exemplo.resourceServer.infra.repository.company

import com.exemplo.resourceServer.infra.entity.company.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {}
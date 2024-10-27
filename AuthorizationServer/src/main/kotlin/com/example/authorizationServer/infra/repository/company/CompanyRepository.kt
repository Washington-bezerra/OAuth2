package com.example.authorizationServer.infra.repository.company

import com.example.authorizationServer.infra.entity.company.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {}
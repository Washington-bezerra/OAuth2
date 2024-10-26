package com.exemplo.resourceServer.infra.repository.client

import com.exemplo.resourceServer.infra.entity.client.Client
import org.springframework.data.mongodb.repository.MongoRepository

interface ClientRepository : MongoRepository<Client, String> {}
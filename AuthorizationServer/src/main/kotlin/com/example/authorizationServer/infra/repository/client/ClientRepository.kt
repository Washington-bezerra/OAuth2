package com.example.authorizationServer.infra.repository.client

import com.example.authorizationServer.infra.entity.client.Client
import org.springframework.data.mongodb.repository.MongoRepository

interface ClientRepository : MongoRepository<Client, String> {}
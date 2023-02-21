package com.nomadhomes.hexagonal_architecture.infraestructure.database.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nomadhomes.hexagonal_architecture.infraestructure.database.mongo.models.BankAccountMongoModel;

@Repository
public interface BankAccountRepository extends MongoRepository<BankAccountMongoModel, String>{
    
}

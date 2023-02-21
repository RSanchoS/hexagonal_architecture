package com.nomadhomes.hexagonal_architecture.infraestructure.database.mongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "bank_account")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountMongoModel {

    @Id
    private String id;
    private String accountNumber;
    private String accountHolderName;
    private Float currentCash;
    
}

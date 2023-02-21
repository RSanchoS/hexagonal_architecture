package com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.create_new_account.ports.in;

import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.response.CreateNewAccountResponse;

public interface CreateNewAccountApiPort {

    CreateNewAccountResponse createNewAccountResponse(String accountHolderNamer);
    
}

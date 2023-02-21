package com.nomadhomes.hexagonal_architecture.infraestructure.api.impl;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.nomadhomes.hexagonal_architecture.domain.bank_account.ports.in.BankAccountApiPort;
import com.nomadhomes.hexagonal_architecture.infraestructure.api.BankAccountController;
import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.request.BankAccountResponse;
import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.request.CreateNewAccountRequest;
import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.response.CreateNewAccountResponse;

@RestController
public class BankAccountControllerImpl implements BankAccountController{


    public BankAccountControllerImpl(BankAccountApiPort bankAccountApiPort) {
        this.bankAccountApiPort = bankAccountApiPort;
    }

    private BankAccountApiPort bankAccountApiPort;

    @Override
    public ResponseEntity<CreateNewAccountResponse> createNewAccount(CreateNewAccountRequest request) {

        return ResponseEntity.ok(bankAccountApiPort.createNewAccountResponse(request.getAccountHolderName()));
        
    }

    @Override
    public ResponseEntity<List<BankAccountResponse>> getAllAccounts() {
        return ResponseEntity.ok(bankAccountApiPort.getAllAccounts());
    }

}

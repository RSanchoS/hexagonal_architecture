package com.nomadhomes.hexagonal_architecture.infraestructure.api;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.request.BankAccountResponse;
import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.request.CreateNewAccountRequest;
import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.response.CreateNewAccountResponse;




public interface BankAccountController {

    @PostMapping("/create")
    public ResponseEntity<CreateNewAccountResponse> createNewAccount(@RequestBody CreateNewAccountRequest request);

    @GetMapping("/all")
    public ResponseEntity<List<BankAccountResponse>> getAllAccounts();
    
}

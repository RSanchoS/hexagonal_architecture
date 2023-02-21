package com.nomadhomes.hexagonal_architecture.infraestructure.api.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateNewAccountResponse {

    private String accountNumber;
    private String accountHolderName;
    
}


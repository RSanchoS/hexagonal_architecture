package com.nomadhomes.hexagonal_architecture.infraestructure.api.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateNewAccountRequest {

    private String accountHolderName;
    
}

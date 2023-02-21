package com.nomadhomes.hexagonal_architecture.domain.bank_account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private Float currentCash;

    public BankAccount updateCurrentCash(Float amount) {
        this.currentCash =  this.currentCash + amount;
        return this;
    }
    
}

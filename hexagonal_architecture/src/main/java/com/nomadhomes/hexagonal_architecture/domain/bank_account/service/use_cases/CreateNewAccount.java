package com.nomadhomes.hexagonal_architecture.domain.bank_account.service.use_cases;

import com.nomadhomes.hexagonal_architecture.domain.bank_account.BankAccount;

public interface CreateNewAccount {
    
    public BankAccount createNewAccount(String accountHolderName);
}

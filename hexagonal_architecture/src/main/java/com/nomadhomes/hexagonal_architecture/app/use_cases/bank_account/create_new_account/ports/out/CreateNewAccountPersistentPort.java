package com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.create_new_account.ports.out;

import com.nomadhomes.hexagonal_architecture.domain.bank_account.BankAccount;

public interface CreateNewAccountPersistentPort {

     BankAccount createNewAccount(BankAccount bankAccount);
    
}

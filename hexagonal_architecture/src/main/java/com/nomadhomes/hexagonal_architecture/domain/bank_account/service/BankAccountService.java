package com.nomadhomes.hexagonal_architecture.domain.bank_account.service;

import com.nomadhomes.hexagonal_architecture.domain.bank_account.service.use_cases.CreateNewAccount;
import com.nomadhomes.hexagonal_architecture.domain.bank_account.service.use_cases.GetAllAccounts;

public interface BankAccountService extends CreateNewAccount, GetAllAccounts {
    
}

package com.nomadhomes.hexagonal_architecture.domain.bank_account.ports.out;

import com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.create_new_account.ports.out.CreateNewAccountPersistentPort;
import com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.get_all_accounts.ports.out.GetAllAccountsPersistentPort;

public interface BankAccountPersistentPort extends CreateNewAccountPersistentPort,
    GetAllAccountsPersistentPort {
    
}

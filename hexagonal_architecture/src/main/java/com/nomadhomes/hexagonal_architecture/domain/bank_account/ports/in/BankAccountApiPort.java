package com.nomadhomes.hexagonal_architecture.domain.bank_account.ports.in;

import com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.create_new_account.ports.in.CreateNewAccountApiPort;
import com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.get_all_accounts.ports.in.GetAllAccountsApiPort;

public interface BankAccountApiPort extends CreateNewAccountApiPort, GetAllAccountsApiPort {
    
}

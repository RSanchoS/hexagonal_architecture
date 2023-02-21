package com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.get_all_accounts.ports.out;

import com.nomadhomes.hexagonal_architecture.domain.bank_account.BankAccount;
import java.util.List;

public interface GetAllAccountsPersistentPort {

    List<BankAccount> getAllAccounts();

}

package com.nomadhomes.hexagonal_architecture.domain.bank_account.service.use_cases;

import com.nomadhomes.hexagonal_architecture.domain.bank_account.BankAccount;
import java.util.List;

public interface GetAllAccounts {

  List<BankAccount> getAllAccounts();

}

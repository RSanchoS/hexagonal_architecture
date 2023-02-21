package com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.get_all_accounts.ports.in;

import java.util.List;

import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.request.BankAccountResponse;

public interface GetAllAccountsApiPort {

  List<BankAccountResponse> getAllAccounts();
}

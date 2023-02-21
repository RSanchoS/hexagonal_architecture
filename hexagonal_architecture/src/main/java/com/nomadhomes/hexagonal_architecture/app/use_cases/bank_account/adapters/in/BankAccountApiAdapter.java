package com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.adapters.in;


import com.nomadhomes.hexagonal_architecture.domain.bank_account.BankAccount;
import com.nomadhomes.hexagonal_architecture.domain.bank_account.ports.in.BankAccountApiPort;
import com.nomadhomes.hexagonal_architecture.domain.bank_account.service.BankAccountService;
import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.request.BankAccountResponse;
import com.nomadhomes.hexagonal_architecture.infraestructure.api.models.response.CreateNewAccountResponse;
import com.nomadhomes.hexagonal_architecture.infraestructure.config.tags.Adapter;
import java.util.List;
import java.util.stream.Collectors;

@Adapter
public class BankAccountApiAdapter implements BankAccountApiPort{

    public BankAccountApiAdapter(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    private BankAccountService bankAccountService;

    @Override
    public CreateNewAccountResponse createNewAccountResponse(String accountHolderNamer) {

        BankAccount bankAccount = bankAccountService.createNewAccount(accountHolderNamer);

        return CreateNewAccountResponse.builder()
                .accountHolderName(bankAccount.getAccountHolderName())
                .accountNumber(bankAccount.getAccountNumber())
                .build();
        
    }

    @Override
    public List<BankAccountResponse> getAllAccounts() {

        List<BankAccount> bankAccounts = bankAccountService.getAllAccounts();

        return bankAccounts.stream()
            .map(bankAccount -> BankAccountResponse.builder()
                .accountHolderName(bankAccount.getAccountHolderName())
                .accountNumber(bankAccount.getAccountNumber())
                .build())
            .collect(Collectors.toList());
    }
}

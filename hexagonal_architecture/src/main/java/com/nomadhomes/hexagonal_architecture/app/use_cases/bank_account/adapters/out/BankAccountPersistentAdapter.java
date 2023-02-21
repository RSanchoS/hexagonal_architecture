package com.nomadhomes.hexagonal_architecture.app.use_cases.bank_account.adapters.out;

import com.nomadhomes.hexagonal_architecture.domain.bank_account.BankAccount;
import com.nomadhomes.hexagonal_architecture.domain.bank_account.ports.out.BankAccountPersistentPort;
import com.nomadhomes.hexagonal_architecture.infraestructure.config.tags.Adapter;
import com.nomadhomes.hexagonal_architecture.infraestructure.database.mongo.models.BankAccountMongoModel;
import com.nomadhomes.hexagonal_architecture.infraestructure.database.mongo.repositories.BankAccountRepository;

import java.util.List;
import java.util.stream.Collectors;

@Adapter
public class BankAccountPersistentAdapter implements BankAccountPersistentPort{

    public BankAccountPersistentAdapter(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    
    private BankAccountRepository bankAccountRepository;

    @Override
    public BankAccount createNewAccount(BankAccount bankAccount) {

        BankAccountMongoModel bankAccountMongoModel = BankAccountMongoModel.builder()
                .accountHolderName(bankAccount.getAccountHolderName())
                .accountNumber(bankAccount.getAccountNumber())
                .build();

        BankAccountMongoModel bankAccountMongoModelSaved = bankAccountRepository.save(bankAccountMongoModel);

        return BankAccount.builder()
                .accountHolderName(bankAccountMongoModelSaved.getAccountHolderName())
                .accountNumber(bankAccountMongoModelSaved.getAccountNumber())
                .build();
    }

    @Override
    public List<BankAccount> getAllAccounts() {

        List<BankAccountMongoModel> bankAccountMongoModels = bankAccountRepository.findAll();

        return bankAccountMongoModels.stream()
                .map(bankAccountMongoModel -> BankAccount.builder()
                    .accountHolderName(bankAccountMongoModel.getAccountHolderName())
                    .accountNumber(bankAccountMongoModel.getAccountNumber())
                    .build())
                .collect(Collectors.toList());

    }
}

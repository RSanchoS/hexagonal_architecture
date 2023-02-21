package com.nomadhomes.hexagonal_architecture.domain.bank_account.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.nomadhomes.hexagonal_architecture.domain.bank_account.BankAccount;
import com.nomadhomes.hexagonal_architecture.domain.bank_account.ports.out.BankAccountPersistentPort;
import com.nomadhomes.hexagonal_architecture.domain.bank_account.service.BankAccountService;

@Service 
public class BankAccountServiceImpl implements BankAccountService{

    public BankAccountServiceImpl(BankAccountPersistentPort bankAccountPersistentPort) {
        this.bankAccountPersistentPort = bankAccountPersistentPort;
    }

    private BankAccountPersistentPort bankAccountPersistentPort;

    @Override
    public BankAccount createNewAccount(String accountHolderName) {

        return bankAccountPersistentPort.createNewAccount(BankAccount.builder()
                .accountHolderName(accountHolderName)
                .accountNumber(UUID.randomUUID().toString())
                .build());

    }

    @Override
    public List<BankAccount> getAllAccounts() {
        return bankAccountPersistentPort.getAllAccounts();
    }
}

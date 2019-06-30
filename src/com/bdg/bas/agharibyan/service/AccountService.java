package com.bdg.bas.agharibyan.service;


import com.bdg.bas.agharibyan.dto.AccountCreationRequest;
import com.bdg.bas.agharibyan.entity.Account;

public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {
    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

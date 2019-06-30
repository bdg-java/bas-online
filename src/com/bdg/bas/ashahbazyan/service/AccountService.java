package com.bdg.bas.ashahbazyan.service;

import com.bdg.bas.ashahbazyan.dto.AccountCreationRequest;
import com.bdg.bas.ashahbazyan.entity.Account;

public class AccountService implements  BankAccountBaseService<Account, AccountCreationRequest> {

    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

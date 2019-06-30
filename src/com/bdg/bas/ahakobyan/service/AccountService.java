package com.bdg.bas.ahakobyan.service;

import com.bdg.bas.ahakobyan.dto.AccountCreationRequest;
import com.bdg.bas.ahakobyan.entity.Account;

public class AccountService implements BankAccountBaseService<Account ,AccountCreationRequest> {


    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

package com.bdg.bas.ashahbazyan.service.account;

import com.bdg.bas.ashahbazyan.dto.AccountCreationRequest;
import com.bdg.bas.ashahbazyan.entity.Account;
import com.bdg.bas.ashahbazyan.service.BankAccountBaseService;

public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {

    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

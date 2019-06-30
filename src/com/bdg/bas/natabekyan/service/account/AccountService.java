package com.bdg.bas.natabekyan.service.account;

import com.bdg.bas.natabekyan.dto.AccountCreationRequest;
import com.bdg.bas.natabekyan.entity.Account;
import com.bdg.bas.natabekyan.service.BankAccountBaseService;

public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {

    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

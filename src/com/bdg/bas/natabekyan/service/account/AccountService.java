package com.bdg.bas.natabekyan.service.account;

import com.bdg.bas.natabekyan.dto.AccountCreationRequest;
import com.bdg.bas.natabekyan.entity.Account;
import com.bdg.bas.natabekyan.service.BankAccuontBaseService;

public class AccountService implements BankAccuontBaseService<Account, AccountCreationRequest> {

    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

package com.bdg.bas.nhakobyan.service.account;

import com.bdg.bas.nhakobyan.dto.AccountCreationRequest;
import com.bdg.bas.nhakobyan.entity.AbstractBankEntity;
import com.bdg.bas.nhakobyan.entity.Account;
import com.bdg.bas.nhakobyan.service.BankAccountBaseService;


public class AccountService implements BankAccountBaseService<Account,AccountCreationRequest> {

    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

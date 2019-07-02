package com.bdg.bas.asarabyan.service;

import com.bdg.bas.asarabyan.entity.Account;
import com.bdg.bas.asarabyan.dto.AccountCreationRequest;
import com.bdg.bas.asarabyan.entity.BankAccountBaseService;


public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {


    @Override
    public Account create(AccountCreationRequest request) {

        return null;
    }
}

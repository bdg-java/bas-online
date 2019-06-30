package com.bdg.bas.agharibyan.service.account;


import com.bdg.bas.agharibyan.dto.AccountCreationRequest;
import com.bdg.bas.agharibyan.entity.Account;
import com.bdg.bas.agharibyan.service.BankAccountBaseService;

public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {
    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

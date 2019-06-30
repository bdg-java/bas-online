package com.bdg.bas.yabrakamyan.Service;

import com.bdg.bas.yabrakamyan.dto.AccountCreationRequest;
import com.bdg.bas.yabrakamyan.entity.Account;

public class AccountService implements BankAccuontBaseService<Account, AccountCreationRequest> {
    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

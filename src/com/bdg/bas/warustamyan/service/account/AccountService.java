package com.bdg.bas.warustamyan.service.account;


import com.bdg.bas.warustamyan.dto.AccountCreationRequest;
import com.bdg.bas.warustamyan.entity.Account;
import com.bdg.bas.warustamyan.service.BankAccountBaseService;

/**
 * @author William Arustamyan
 */


public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {
    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

package com.bdg.bas.warustamyan.service.account;


import com.bdg.bas.warustamyan.dto.AccountCreationRequest;
import com.bdg.bas.warustamyan.entity.Account;
import com.bdg.bas.warustamyan.service.BankAccuontBaseService;

/**
 * @author William Arustamyan
 */


public class AccountService implements BankAccuontBaseService<Account, AccountCreationRequest> {
    @Override
    public Account create(AccountCreationRequest request) {
        return null;
    }
}

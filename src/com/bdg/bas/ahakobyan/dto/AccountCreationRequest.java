package com.bdg.bas.ahakobyan.dto;

import com.bdg.bas.ahakobyan.dto.AccountBalanceCreationRequest;
import com.bdg.bas.ahakobyan.dto.CreditCardCreationRequest;
import com.bdg.bas.ahakobyan.dto.CustomerCreationRequest;

public class AccountCreationRequest {

    public CustomerCreationRequest customerRequest;
    public CreditCardCreationRequest creditCardRequest;
    public AccountBalanceCreationRequest accountBalanceRequest;

    public AccountCreationRequest(CustomerCreationRequest customerRequest, CreditCardCreationRequest creditCardRequest, AccountBalanceCreationRequest accountBalanceRequest) {
        this.accountBalanceRequest = accountBalanceRequest;
        this.creditCardRequest = creditCardRequest;
        this.customerRequest = customerRequest;
    }
}

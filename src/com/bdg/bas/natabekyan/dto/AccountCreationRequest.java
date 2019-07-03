package com.bdg.bas.natabekyan.dto;

import com.bdg.bas.ahakobyan.dto.CreditCardCreationRequest;

public class AccountCreationRequest {
    public AccountBalanceCreationRequest balanceRequest;
    public CustomerCreationRequest customerRequest;
    public CreditCardCreationRequest cardRequest;

    public AccountCreationRequest(AccountBalanceCreationRequest balance, CustomerCreationRequest customer, com.bdg.bas.ahakobyan.dto.CreditCardCreationRequest creditCard) {
        this.balanceRequest = balance;
        this.customerRequest = customer;
        this.cardRequest = creditCard;
    }
}

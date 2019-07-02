package com.bdg.bas.nhakobyan.dto;

public class AccountCreationRequest {
    public CreditCardCreationRequest creditCard;
    public CustomerCreationRequest customer;
    public AccountBalanceCreationRequest account;

    public AccountCreationRequest(CreditCardCreationRequest creditCard, CustomerCreationRequest customer, AccountBalanceCreationRequest account) {
        this.creditCard = creditCard;
        this.customer = customer;
        this.account = account;
    }
}

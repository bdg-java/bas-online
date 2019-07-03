package com.bdg.bas.yabrakamyan.dto;

public class AccountCreationRequest {

    public AccountBalanceCreationRequest balanceRequest;
    public CustomerCreationRequest customerRequest;
    public CreditCardCreationRequest cardRequest;

    public AccountCreationRequest(AccountBalanceCreationRequest balance, CustomerCreationRequest customer, CreditCardCreationRequest creditCard) {
        this.balanceRequest = balance;
        this.customerRequest = customer;
        this.cardRequest = creditCard;
    }
}

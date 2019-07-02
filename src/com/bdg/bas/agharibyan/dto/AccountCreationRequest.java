package com.bdg.bas.agharibyan.dto;

public class AccountCreationRequest {

    public CustomerCreationRequest customerRequest;
    public CreditCardCreationRequest cardRequest;
    public AccountBalanceCreationRequest balanceRequest;

    public AccountCreationRequest(CustomerCreationRequest customer, CreditCardCreationRequest card, AccountBalanceCreationRequest balance){
        this.customerRequest = customer;
        this.cardRequest = card;
        this.balanceRequest = balance;
    }

}

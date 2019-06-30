package com.bdg.bas.ahakobyan.entity;

public class Account extends AbstractEntity {

    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;

    public Account(Customer customer, CreditCard creditCard, AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
        this.creditCard = creditCard;
        this.customer = customer;
    }
}

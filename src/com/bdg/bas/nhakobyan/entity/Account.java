package com.bdg.bas.nhakobyan.entity;

public class Account extends AbstractBankEntity {
    protected Customer customer;
    protected CreditCard creditCard;
    protected AccountBalance accountBalance;

    public Account(Customer customer, CreditCard creditCard, AccountBalance accountBalance) {
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
    }
}

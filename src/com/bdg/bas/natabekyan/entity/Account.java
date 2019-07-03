package com.bdg.bas.natabekyan.entity;

public class Account extends AbstractEntity {

    private Customer customer;
    private CreditCard creditCard;
    private double accountBalance;

    public Account(Customer customer, CreditCard creditCard, double accountBalance) {
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
    }
}

package com.bdg.bas.yabrakamyan.entity;

public class Account extends AbstractBankEntity {

    private Customer customer;
    private AccountBalance accountBalance;
    private CreditCard creditCard;

    public Account(Customer customer, CreditCard accountBalance, double creditCard) {
        this.customer = customer;
        this.accountBalance = accountBalance;
        this.creditCard = creditCard;
    }
}

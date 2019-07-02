package com.bdg.bas.agharibyan.entity;

public class Account extends AbstractBankEntity{

    private Customer customer;
    private CreditCard creditCard;
    private double accountBalance;

    public Account(Customer costomer, CreditCard creditCard, double accountBalance){
        this.customer = costomer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
    }

}

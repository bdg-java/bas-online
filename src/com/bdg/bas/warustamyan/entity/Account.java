package com.bdg.bas.warustamyan.entity;


/**
 * @author William Arustamyan
 */


public class Account extends AbstractBasEntity {

    private Customer customer;
    private CreditCard creditCard;
    private double accountBalance;

    public Account(Customer customer, CreditCard creditCard, double accountBalance) {
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
    }
}

package com.bdg.bas.yabrakamyan.entity;

public class Customer extends AbstractBankEtity{

    protected String firstName;
    protected String lastName;
    protected Adress adress;

    public Customer(String firstName, String lastName, Adress adress) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }
}

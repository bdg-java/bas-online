package com.bdg.bas.yabrakamyan.entity;

public class Customer extends AbstractBankEntity {

    protected String firstName;
    protected String lastName;
    protected Address adress;

    public Customer(String firstName, String lastName, Address adress) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }
}

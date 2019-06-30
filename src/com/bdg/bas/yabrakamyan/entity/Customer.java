package com.bdg.bas.yabrakamyan.entity;

public class Customer extends AbstractBankEntity {

    protected String firstName;
    protected String lastName;
    protected Address address;

    public Customer(String firstName, String lastName, Address address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}

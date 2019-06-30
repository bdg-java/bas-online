package com.bdg.bas.ahakobyan.entity;

public class Customer extends AbstractEntity {

    private String firstName;
    private String lastName;
    private Address address;

    public Customer(String firstName, String lastName, Address address) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

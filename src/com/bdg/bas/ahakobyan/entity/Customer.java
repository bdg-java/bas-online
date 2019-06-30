package com.bdg.bas.ahakobyan.entity;

import com.bdg.bas.ahakobyan.common.Address;

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

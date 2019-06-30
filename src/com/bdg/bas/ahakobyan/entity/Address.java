package com.bdg.bas.ahakobyan.entity;

import com.bdg.bas.agharibyan.common.Country;

public class Address {

    private String phoneNumber;
    private String street;
    private Country country;

    public Address(String phoneNumber, String street, Country country) {
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.street = street;
    }
}

package com.bdg.bas.yabrakamyan.entity;


import com.bdg.bas.yabrakamyan.common.Country;

public class Address extends AbstractBankEntity {

    private String phoneNumber;
    private Country country;
    private String street;

    public Address(String phoneNumber, Country country, String street) {
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.street = street;
    }
}

package com.bdg.bas.nhakobyan.entity;

import com.bdg.bas.nhakobyan.common.Country;

public class Address extends AbstractBankEntity {
    protected String phoneNumber;
    protected String street;
    protected Country country;

    public Address(String phoneNumber, String street, Country country) {
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.country = country;
    }
}

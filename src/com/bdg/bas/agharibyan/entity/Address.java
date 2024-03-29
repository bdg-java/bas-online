package com.bdg.bas.agharibyan.entity;

import com.bdg.bas.agharibyan.common.Country;

public class Address extends AbstractBankEntity{

    private String phoneNumber;
    private String street;
    private Country country;

    public Address(String phoneNumber, String street, Country country){
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.country = country;
    }
}

package com.bdg.bas.tminasyan.entity;

import com.bdg.bas.tminasyan.common.Country;

public class Address extends AbstractBasEntity {
    private String phoneNumber;
    private String street;
    private Country country;

    public Address(String phoneNumber, String street,Country country){
        this.phoneNumber=phoneNumber;
        this.street=street;
        this.country=country;
    }
}

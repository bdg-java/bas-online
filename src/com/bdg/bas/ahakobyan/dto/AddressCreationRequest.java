package com.bdg.bas.ahakobyan.dto;

import com.bdg.bas.ahakobyan.common.Country;

public class AddressCreationRequest {

    public String street;
    public String phoneNumber;
    public Country country;

    public AddressCreationRequest(String street, String phoneNumber, Country country) {
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }
}

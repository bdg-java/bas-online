package com.bdg.bas.nhakobyan.dto;

public class AddressCreationRequest {
    public String phoneNumber;
    public String Country;
    public String street;

    public AddressCreationRequest(String phoneNumber, String country, String street) {
        this.phoneNumber = phoneNumber;
        Country = country;
        this.street = street;
    }
}

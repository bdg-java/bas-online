package com.bdg.bas.yabrakamyan.dto;

public class AddressCreationRequest {

    public String phoneNumber;
    public String country;
    public String street;

    public AddressCreationRequest(String phoneNumber, String country, String street) {
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.street = street;
    }
}

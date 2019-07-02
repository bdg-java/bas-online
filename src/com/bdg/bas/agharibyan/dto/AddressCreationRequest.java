package com.bdg.bas.agharibyan.dto;

public class AddressCreationRequest {

    public String phoneNumber;
    public String street;
    public String country;

    public AddressCreationRequest(String phoneNumber, String street, String country){
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.country = country;
    }
}

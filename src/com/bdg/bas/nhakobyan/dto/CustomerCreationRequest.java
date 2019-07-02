package com.bdg.bas.nhakobyan.dto;

public class CustomerCreationRequest {
    public String firstName;
    public String lastName;
    public AddressCreationRequest address;

    public CustomerCreationRequest(String firstName, String lastName, AddressCreationRequest address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}

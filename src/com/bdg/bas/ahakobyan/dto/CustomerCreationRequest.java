package com.bdg.bas.ahakobyan.dto;



public class CustomerCreationRequest {

    public String firstName;
    public String lastName;
    public AddressCreationRequest addressRequest;

    public CustomerCreationRequest(String firstName, String lastName, AddressCreationRequest addressRequest) {
        this.addressRequest = addressRequest;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

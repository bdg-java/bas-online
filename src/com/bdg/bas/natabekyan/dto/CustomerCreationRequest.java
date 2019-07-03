package com.bdg.bas.natabekyan.dto;

public class CustomerCreationRequest {

    public String firstName;
    public String lastName;
    public AddressCreationRequest addrRequest;

    public CustomerCreationRequest(String firstName, String lastName, AddressCreationRequest addrReq) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addrRequest = addrReq;
    }
}

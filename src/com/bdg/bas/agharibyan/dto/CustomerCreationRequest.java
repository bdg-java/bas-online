package com.bdg.bas.agharibyan.dto;

public class CustomerCreationRequest {

    public String firstName;
    public String lastName;
    public AddressCreationRequest addrRequest;

    public CustomerCreationRequest(String firstName, String lastName, AddressCreationRequest addrRequest){
        this.firstName = firstName;
        this.lastName = lastName;
        this.addrRequest = addrRequest;
    }

}

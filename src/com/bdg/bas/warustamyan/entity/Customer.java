package com.bdg.bas.warustamyan.entity;


/**
 * @author William Arustamyan
 */


public class Customer extends AbstractBasEntity {

    private String firstName;
    private String lastName;
    private Address address;

    public Customer(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}

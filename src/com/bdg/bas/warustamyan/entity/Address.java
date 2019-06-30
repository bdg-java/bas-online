package com.bdg.bas.warustamyan.entity;


import com.bdg.bas.warustamyan.common.Country;

/**
 * @author William Arustamyan
 */


public class Address extends AbstractBasEntity {

    private String phoneNumber;
    private Country country;
    private String street;

    public Address(String phoneNumber, Country country, String street) {
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.street = street;
    }
}

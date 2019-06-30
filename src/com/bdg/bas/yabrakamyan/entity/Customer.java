package com.bdg.bas.yabrakamyan.entity;

import com.bdg.bas.yabrakamyan.common.Address;

public class Customer extends AbstractBankEtity{

    protected String firstName;
    protected String lastName;
    protected Address adress;

    public Customer(String firstName, String lastName, Address adress) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }
}

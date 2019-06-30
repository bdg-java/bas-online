package com.bdg.bas.yabrakamyan.Service;

import com.bdg.bas.yabrakamyan.dto.CustomerCreationRequest;
import com.bdg.bas.yabrakamyan.entity.Customer;

public class CustomerService implements BankAccuontBaseService <Customer, CustomerCreationRequest> {
    @Override
    public Customer create(CustomerCreationRequest request) {
        return null;
    }
}

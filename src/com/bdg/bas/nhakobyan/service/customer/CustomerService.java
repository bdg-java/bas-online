package com.bdg.bas.nhakobyan.service.customer;

import com.bdg.bas.nhakobyan.dto.CustomerCreationRequest;
import com.bdg.bas.nhakobyan.entity.Customer;
import com.bdg.bas.nhakobyan.service.BankAccountBaseService;

public class CustomerService implements BankAccountBaseService<Customer,CustomerCreationRequest > {
    @Override
    public Customer create(CustomerCreationRequest request) {
        return null;
    }
}

package com.bdg.bas.natabekyan.service.customer;

import com.bdg.bas.natabekyan.dto.CustomerCreationRequest;
import com.bdg.bas.natabekyan.entity.Customer;
import com.bdg.bas.natabekyan.service.BankAccountBaseService;

public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {

    @Override
    public Customer create(CustomerCreationRequest request) {
        return null;
    }
}

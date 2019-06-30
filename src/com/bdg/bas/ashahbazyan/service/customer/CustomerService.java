package com.bdg.bas.ashahbazyan.service.customer;

import com.bdg.bas.ashahbazyan.dto.CustomerCreationRequest;
import com.bdg.bas.ashahbazyan.entity.Customer;
import com.bdg.bas.ashahbazyan.service.BankAccountBaseService;

public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {
    @Override
    public Customer create(CustomerCreationRequest request) {
        return null;
    }
}

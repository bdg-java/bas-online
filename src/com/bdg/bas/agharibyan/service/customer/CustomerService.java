package com.bdg.bas.agharibyan.service.customer;

import com.bdg.bas.agharibyan.dto.CustomerCreationRequest;
import com.bdg.bas.agharibyan.entity.Customer;
import com.bdg.bas.agharibyan.service.BankAccountBaseService;

public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {

    @Override
    public Customer create(CustomerCreationRequest request) {
        return null;
    }
}

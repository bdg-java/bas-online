package com.bdg.bas.ahakobyan.customer;

import com.bdg.bas.ahakobyan.dto.CustomerCreationRequest;
import com.bdg.bas.ahakobyan.entity.Customer;
import com.bdg.bas.ahakobyan.service.BankAccountBaseService;

public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {

    public Customer create(CustomerCreationRequest request) {
        return null;
    }

}

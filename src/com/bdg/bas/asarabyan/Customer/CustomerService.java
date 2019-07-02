package com.bdg.bas.asarabyan.Customer;

import com.bdg.bas.asarabyan.entity.BankAccountBaseService;
import com.bdg.bas.asarabyan.entity.Customer;
import com.bdg.bas.asarabyan.dto.CustomerCreationRequest;


public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {


    @Override
    public Customer create(CustomerCreationRequest request) {
        return null;
    }

}

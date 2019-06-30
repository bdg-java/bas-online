package com.bdg.bas.warustamyan.service.customer;


import com.bdg.bas.warustamyan.dto.CustomerCreationRequest;
import com.bdg.bas.warustamyan.entity.Customer;
import com.bdg.bas.warustamyan.service.BankAccountBaseService;

/**
 * @author William Arustamyan
 */


public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {

    @Override
    public Customer create(CustomerCreationRequest request) {
        return null;
    }
}

package com.bdg.bas.warustamyan.service.customer;


import com.bdg.bas.warustamyan.dto.AddressCreationRequest;
import com.bdg.bas.warustamyan.dto.CustomerCreationRequest;
import com.bdg.bas.warustamyan.entity.Address;
import com.bdg.bas.warustamyan.entity.Customer;
import com.bdg.bas.warustamyan.service.BankAccountBaseService;
import com.bdg.bas.warustamyan.service.address.AddressService;
import com.bdg.bas.warustamyan.storage.MemoryStorage;
import com.bdg.bas.warustamyan.storage.Storage;

/**
 * @author William Arustamyan
 */


public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {

    private final Storage<Customer> storage = new MemoryStorage<>(STORAGE_SIZE);

    private final BankAccountBaseService<Address, AddressCreationRequest> addressService = new AddressService();

    @Override
    public Customer create(CustomerCreationRequest request) {
        Address address = addressService.create(request.addrRequest);
        Customer customer = new Customer(request.firstName, request.lastName, address);
        return storage.add(customer);
    }
}

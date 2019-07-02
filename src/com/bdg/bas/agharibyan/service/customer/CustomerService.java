package com.bdg.bas.agharibyan.service.customer;

import com.bdg.bas.agharibyan.dto.AddressCreationRequest;
import com.bdg.bas.agharibyan.dto.CustomerCreationRequest;
import com.bdg.bas.agharibyan.entity.Address;
import com.bdg.bas.agharibyan.entity.Customer;
import com.bdg.bas.agharibyan.service.BankAccountBaseService;
import com.bdg.bas.agharibyan.service.address.AddressService;
import com.bdg.bas.agharibyan.storage.MemoryStorage;
import com.bdg.bas.agharibyan.storage.Storage;

public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {

    private final Storage<Customer> storage = new MemoryStorage<>(STORAGE_SIZE);

    private final BankAccountBaseService<Address, AddressCreationRequest> addressService = new AddressService();

    @Override
    public Customer create(CustomerCreationRequest request) {
        Address address = addressService.create(request.addrRequest);
        Customer customer = new Customer(request.firstName, request.lastName, address);
        return storage.add(customer);
    }

    @Override
    public Customer get(int id) {
        return null;
    }

    @Override
    public Customer remove(int id) {
        return null;
    }
}

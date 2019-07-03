package com.bdg.bas.natabekyan.service.customer;

import com.bdg.bas.natabekyan.dto.AddressCreationRequest;
import com.bdg.bas.natabekyan.dto.CustomerCreationRequest;
import com.bdg.bas.natabekyan.entity.Address;
import com.bdg.bas.natabekyan.entity.Customer;
import com.bdg.bas.natabekyan.service.BankAccountBaseService;
import com.bdg.bas.natabekyan.service.address.AddressService;
import com.bdg.bas.natabekyan.storage.MemoryStorage;
import com.bdg.bas.natabekyan.storage.Storage;

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
    public Customer remove(int id) {
        Customer customer = storage.remove(id);
        return customer;
    }

    @Override
    public Customer get(int id) {
        Customer customer = storage.get(id);
        return customer;
    }
}

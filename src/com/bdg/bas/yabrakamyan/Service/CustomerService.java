package com.bdg.bas.yabrakamyan.Service;

import com.bdg.bas.yabrakamyan.Storage.MemoryStorage;
import com.bdg.bas.yabrakamyan.Storage.Storage;
import com.bdg.bas.yabrakamyan.dto.AddressCreationRequest;
import com.bdg.bas.yabrakamyan.dto.CustomerCreationRequest;
import com.bdg.bas.yabrakamyan.entity.Address;
import com.bdg.bas.yabrakamyan.entity.Customer;


public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {

    private final Storage<Customer> storage = new MemoryStorage<>(STORAGE_SIZE);

    private final BankAccountBaseService<Address, AddressCreationRequest> addressService = (BankAccountBaseService<Address, AddressCreationRequest>) new AddressService();

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
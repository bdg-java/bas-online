package com.bdg.bas.ahakobyan.service.customer;

import com.bdg.bas.ahakobyan.dto.AddressCreationRequest;
import com.bdg.bas.ahakobyan.dto.CustomerCreationRequest;
import com.bdg.bas.ahakobyan.entity.Address;
import com.bdg.bas.ahakobyan.entity.Customer;
import com.bdg.bas.ahakobyan.service.BankAccountBaseService;
import com.bdg.bas.ahakobyan.service.address.AddressService;
import com.bdg.bas.ahakobyan.storage.MemoryStorage;
import com.bdg.bas.ahakobyan.storage.Storage;

public class CustomerService implements BankAccountBaseService<Customer, CustomerCreationRequest> {

    private final Storage<Customer> customerStorage = new MemoryStorage<>(STORAGE_SIZE);
    private final BankAccountBaseService<Address, AddressCreationRequest> addressService = new AddressService();

    @Override
    public Customer create(CustomerCreationRequest request) {
        Address address = addressService.create(request.addressRequest);
        Customer customer = new Customer(request.firstName, request.lastName, address);

        return customerStorage.add(customer);
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

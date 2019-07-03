package com.bdg.bas.yabrakamyan.Service;

import com.bdg.bas.yabrakamyan.Storage.MemoryStorage;
import com.bdg.bas.yabrakamyan.Storage.Storage;
import com.bdg.bas.yabrakamyan.common.Country;
import com.bdg.bas.yabrakamyan.dto.AddressCreationRequest;
import com.bdg.bas.yabrakamyan.entity.Address;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {
    private final Storage<Address> storage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public Address create(AddressCreationRequest request) {

        Address address = new Address(request.phoneNumber, Country.findByName(request.country), request.street);
        return storage.add(address);
    }

    @Override
    public Address get(int id) {
        return null;
    }

    @Override
    public Address remove(int id) {
        return null;
    }
}


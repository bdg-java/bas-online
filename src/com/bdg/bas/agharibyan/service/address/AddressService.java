package com.bdg.bas.agharibyan.service.address;

import com.bdg.bas.agharibyan.common.Country;
import com.bdg.bas.agharibyan.dto.AddressCreationRequest;
import com.bdg.bas.agharibyan.entity.Address;
import com.bdg.bas.agharibyan.service.BankAccountBaseService;
import com.bdg.bas.agharibyan.storage.MemoryStorage;
import com.bdg.bas.agharibyan.storage.Storage;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {

    private final Storage<Address> storage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public Address create(AddressCreationRequest request) {

        Address address = new Address(request.phoneNumber, request.street, Country.findByName(request.country));
        return storage.add(address);
    }

    @Override
    public Address get(int id) {
        return storage.get(id);
    }

    @Override
    public Address remove(int id) {
        return null;
    }
}

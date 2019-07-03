package com.bdg.bas.ahakobyan.service.address;

import com.bdg.bas.ahakobyan.dto.AddressCreationRequest;
import com.bdg.bas.ahakobyan.entity.Address;
import com.bdg.bas.ahakobyan.service.BankAccountBaseService;
import com.bdg.bas.ahakobyan.storage.MemoryStorage;
import com.bdg.bas.ahakobyan.storage.Storage;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {

    private final Storage<Address> addressStorage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public Address create(AddressCreationRequest request) {

        Address address = new Address(request.phoneNumber, request.street, request.country);
        return addressStorage.add(address);
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

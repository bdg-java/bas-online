package com.bdg.bas.warustamyan.service.address;


import com.bdg.bas.warustamyan.common.Country;
import com.bdg.bas.warustamyan.dto.AddressCreationRequest;
import com.bdg.bas.warustamyan.entity.Address;
import com.bdg.bas.warustamyan.service.BankAccountBaseService;
import com.bdg.bas.warustamyan.storage.MemoryStorage;
import com.bdg.bas.warustamyan.storage.Storage;

/**
 * @author William Arustamyan
 */


public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {

    private final Storage<Address> storage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public Address create(AddressCreationRequest request) {

        Address address = new Address(request.phoneNumber, Country.findByName(request.country), request.street);
        return storage.add(address);
    }
}

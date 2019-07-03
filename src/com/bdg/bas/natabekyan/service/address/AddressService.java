package com.bdg.bas.natabekyan.service.address;

import com.bdg.bas.natabekyan.dto.AddressCreationRequest;
import com.bdg.bas.natabekyan.entity.Address;
import com.bdg.bas.natabekyan.service.BankAccountBaseService;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {

    @Override
    public Address create(AddressCreationRequest request) {

        return null;
    }

    @Override
    public Address remove(int id) {
        return null;
    }

    @Override
    public Address get(int id) {
        return null;
    }
}

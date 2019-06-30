package com.bdg.bas.agharibyan.service.address;

import com.bdg.bas.agharibyan.dto.AddressCreationRequest;
import com.bdg.bas.agharibyan.entity.Address;
import com.bdg.bas.agharibyan.service.BankAccountBaseService;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {

    @Override
    public Address create(AddressCreationRequest request) {
        return null;
    }
}

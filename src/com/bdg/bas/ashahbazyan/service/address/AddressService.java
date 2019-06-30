package com.bdg.bas.ashahbazyan.service.address;

import com.bdg.bas.ashahbazyan.dto.AddressCreationRequest;
import com.bdg.bas.ashahbazyan.entity.Address;
import com.bdg.bas.ashahbazyan.service.BankAccountBaseService;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {
    @Override
    public Address create(AddressCreationRequest request) {
        return null;
    }
}

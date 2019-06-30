package com.bdg.bas.nhakobyan.service.address;

import com.bdg.bas.nhakobyan.dto.AddressCreationRequest;
import com.bdg.bas.nhakobyan.entity.Address;
import com.bdg.bas.nhakobyan.service.BankAccountBaseService;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {
    @Override
    public Address create(AddressCreationRequest request) {
        return null;
    }
}

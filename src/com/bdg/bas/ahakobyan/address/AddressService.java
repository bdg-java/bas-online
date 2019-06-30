package com.bdg.bas.ahakobyan.address;

import com.bdg.bas.ahakobyan.dto.AddressCreationRequest;
import com.bdg.bas.ahakobyan.entity.Address;
import com.bdg.bas.ahakobyan.service.BankAccountBaseService;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {

    @Override
    public Address create(AddressCreationRequest request) {
        return null;
    }
}

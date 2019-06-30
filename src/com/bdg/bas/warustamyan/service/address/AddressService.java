package com.bdg.bas.warustamyan.service.address;


import com.bdg.bas.warustamyan.dto.AddressCreationRequest;
import com.bdg.bas.warustamyan.entity.Address;
import com.bdg.bas.warustamyan.service.BankAccountBaseService;

/**
 * @author William Arustamyan
 */


public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {
    @Override
    public Address create(AddressCreationRequest request) {
        return null;
    }
}

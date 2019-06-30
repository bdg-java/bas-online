package com.bdg.bas.ahakobyan.creditCard;

import com.bdg.bas.ahakobyan.dto.CreditCardCreationRequest;
import com.bdg.bas.ahakobyan.entity.CreditCard;
import com.bdg.bas.ahakobyan.service.BankAccountBaseService;

public class CreditCardService implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {

    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        return null;
    }
}

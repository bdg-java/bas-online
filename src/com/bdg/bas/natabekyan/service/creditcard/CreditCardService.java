package com.bdg.bas.natabekyan.service.creditcard;

import com.bdg.bas.ahakobyan.dto.CreditCardCreationRequest;
import com.bdg.bas.natabekyan.entity.CreditCard;
import com.bdg.bas.natabekyan.service.BankAccountBaseService;

public class CreditCardService implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {

    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        return null;
    }
}

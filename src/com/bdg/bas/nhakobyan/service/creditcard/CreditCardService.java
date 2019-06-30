package com.bdg.bas.nhakobyan.service.creditcard;

import com.bdg.bas.nhakobyan.dto.CreditCardCreationRequest;
import com.bdg.bas.nhakobyan.entity.CreditCard;
import com.bdg.bas.nhakobyan.service.BankAccountBaseService;

public class CreditCardService implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {
    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        return null;
    }
}

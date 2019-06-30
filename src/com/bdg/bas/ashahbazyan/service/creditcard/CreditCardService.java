package com.bdg.bas.ashahbazyan.service.creditcard;

import com.bdg.bas.ashahbazyan.dto.CreditCardCreationRequest;
import com.bdg.bas.ashahbazyan.entity.CreditCard;
import com.bdg.bas.ashahbazyan.service.BankAccountBaseService;

public class CreditCardService  implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {
    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        return null;
    }
}

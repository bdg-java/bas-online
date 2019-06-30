package com.bdg.bas.warustamyan.service.creditcard;


import com.bdg.bas.natabekyan.dto.CreditCardCreationRequest;
import com.bdg.bas.warustamyan.entity.CreditCard;
import com.bdg.bas.warustamyan.service.BankAccountBaseService;

/**
 * @author William Arustamyan
 */


public class CreditCardService implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {
    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        return null;
    }
}

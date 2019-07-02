package com.bdg.bas.agharibyan.service.creditCard;

import com.bdg.bas.agharibyan.common.CardType;
import com.bdg.bas.agharibyan.dto.CreditCardCreationRequest;
import com.bdg.bas.agharibyan.entity.CreditCard;
import com.bdg.bas.agharibyan.service.BankAccountBaseService;
import com.bdg.bas.agharibyan.storage.MemoryStorage;
import com.bdg.bas.agharibyan.storage.Storage;

public class CreditCardService implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {

    private final Storage<CreditCard> storage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        CreditCard creditCard = new CreditCard(CardType.find(request.cardType));
        return storage.add(creditCard);
    }

    @Override
    public CreditCard get(int id) {
        return null;
    }

    @Override
    public CreditCard remove(int id) {
        return null;
    }
}

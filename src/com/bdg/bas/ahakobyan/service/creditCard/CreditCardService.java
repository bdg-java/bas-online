package com.bdg.bas.ahakobyan.service.creditCard;

import com.bdg.bas.ahakobyan.dto.CreditCardCreationRequest;
import com.bdg.bas.ahakobyan.entity.CreditCard;
import com.bdg.bas.ahakobyan.service.BankAccountBaseService;
import com.bdg.bas.ahakobyan.storage.MemoryStorage;
import com.bdg.bas.ahakobyan.storage.Storage;

public class CreditCardService implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {

    private final Storage<CreditCard> cardStorage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public CreditCard create(CreditCardCreationRequest request) {

        CreditCard creditCard = new CreditCard();
        return cardStorage.add(creditCard);
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

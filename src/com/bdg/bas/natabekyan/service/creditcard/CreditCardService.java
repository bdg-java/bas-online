package com.bdg.bas.natabekyan.service.creditcard;

import com.bdg.bas.ahakobyan.dto.CreditCardCreationRequest;
import com.bdg.bas.natabekyan.entity.CreditCard;
import com.bdg.bas.natabekyan.service.BankAccountBaseService;
import com.bdg.bas.natabekyan.storage.MemoryStorage;
import com.bdg.bas.natabekyan.storage.Storage;
import com.bdg.bas.natabekyan.common.CardType;

import java.time.LocalDate;

public class CreditCardService implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {

    private final Storage<CreditCard> storage = new MemoryStorage<>(STORAGE_SIZE);


    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        Generator generator = new Generator();
        LocalDate crDate = LocalDate.now();
        CardType cardType = CardType.valueOf("VISA");
        CreditCard creditCard = new CreditCard(1, cardType, generator.generateCardNumber(16), LocalDate.now().plusMonths(48), 123);
        return storage.add(creditCard);
    }

    @Override
    public CreditCard remove(int id) {
        CreditCard creditCard = storage.remove(id);
        return creditCard;
    }

    @Override
    public CreditCard get(int id) {
        CreditCard creditCard = storage.get(id);
        return creditCard;
    }
}

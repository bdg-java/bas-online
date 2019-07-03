package com.bdg.bas.ahakobyan.service.account;

import com.bdg.bas.ahakobyan.dto.AccountCreationRequest;
import com.bdg.bas.ahakobyan.dto.CreditCardCreationRequest;
import com.bdg.bas.ahakobyan.dto.CustomerCreationRequest;
import com.bdg.bas.ahakobyan.entity.Account;
import com.bdg.bas.ahakobyan.entity.CreditCard;
import com.bdg.bas.ahakobyan.entity.Customer;
import com.bdg.bas.ahakobyan.service.BankAccountBaseService;
import com.bdg.bas.ahakobyan.service.creditCard.CreditCardService;
import com.bdg.bas.ahakobyan.service.customer.CustomerService;
import com.bdg.bas.ahakobyan.storage.MemoryStorage;
import com.bdg.bas.ahakobyan.storage.Storage;

public class AccountService implements BankAccountBaseService<Account ,AccountCreationRequest> {

    private final Storage<Account> storage = new MemoryStorage<>(STORAGE_SIZE);
    private final BankAccountBaseService<Customer, CustomerCreationRequest> customerService = new CustomerService();
    private final BankAccountBaseService<CreditCard, CreditCardCreationRequest> creditCardService = new CreditCardService();


    @Override
    public Account create(AccountCreationRequest request) {
        Customer customer = customerService.create(request.customerRequest);
        CreditCard creditCard = creditCardService.create(request.creditCardRequest);
        Account account = new Account(customer,creditCard, request.accountBalanceRequest.amount);

        return storage.add(account);
    }

    @Override
    public Account get(int id) {
        return null;
    }

    @Override
    public Account remove(int id) {
        return null;
    }
}

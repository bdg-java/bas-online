package com.bdg.bas.agharibyan.service.account;


import com.bdg.bas.agharibyan.dto.AccountCreationRequest;
import com.bdg.bas.agharibyan.dto.CreditCardCreationRequest;
import com.bdg.bas.agharibyan.dto.CustomerCreationRequest;
import com.bdg.bas.agharibyan.entity.Account;
import com.bdg.bas.agharibyan.entity.CreditCard;
import com.bdg.bas.agharibyan.entity.Customer;
import com.bdg.bas.agharibyan.service.BankAccountBaseService;
import com.bdg.bas.agharibyan.service.creditCard.CreditCardService;
import com.bdg.bas.agharibyan.service.customer.CustomerService;
import com.bdg.bas.agharibyan.storage.MemoryStorage;
import com.bdg.bas.agharibyan.storage.Storage;

public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {

    private final Storage<Account> storage = new MemoryStorage<>(STORAGE_SIZE);

    private final BankAccountBaseService<Customer, CustomerCreationRequest> customerService = new CustomerService();
    private final BankAccountBaseService<CreditCard, CreditCardCreationRequest> creditCardService = new CreditCardService();

    @Override
    public Account create(AccountCreationRequest request) {
        Customer customer = customerService.create(request.customerRequest);
        CreditCard card = creditCardService.create(request.cardRequest);
        Account account = new Account(customer,card, request.balanceRequest.amount);

        return storage.add(account);
    }

    @Override
    public Account get(int id) {
        return storage.get(id);
    }

    @Override
    public Account remove(int id) {
        return null;
    }
}

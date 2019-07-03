package com.bdg.bas.natabekyan.service.account;


import com.bdg.bas.natabekyan.dto.AccountCreationRequest;
import com.bdg.bas.natabekyan.dto.CustomerCreationRequest;
import com.bdg.bas.natabekyan.entity.Account;
import com.bdg.bas.natabekyan.entity.CreditCard;
import com.bdg.bas.natabekyan.entity.Customer;
import com.bdg.bas.natabekyan.service.BankAccountBaseService;
import com.bdg.bas.natabekyan.service.creditcard.CreditCardService;
import com.bdg.bas.natabekyan.service.customer.CustomerService;
import com.bdg.bas.natabekyan.storage.MemoryStorage;
import com.bdg.bas.natabekyan.storage.Storage;

public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {

    private final Storage<Account> storage = new MemoryStorage<>(STORAGE_SIZE);

    private final BankAccountBaseService<Customer, CustomerCreationRequest> customerService = new CustomerService();
    private final CreditCardService creditCardService = new CreditCardService();

    @Override
    public Account create(AccountCreationRequest request) {
        Customer customer = customerService.create(request.customerRequest);
        CreditCard creditCard = creditCardService.create(request.cardRequest);

        Account account = new Account(customer, creditCard, request.balanceRequest.amount);
        return storage.add(account);
    }

    @Override
    public Account remove(int id) {
        Account account = storage.remove(id);
        return account;
    }

    @Override
    public Account get(int id) {
        Account account = storage.get(id);
        return account;
    }
}

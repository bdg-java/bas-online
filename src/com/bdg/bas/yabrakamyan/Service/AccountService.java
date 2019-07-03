package com.bdg.bas.yabrakamyan.Service;

import com.bdg.bas.yabrakamyan.Storage.MemoryStorage;
import com.bdg.bas.yabrakamyan.Storage.Storage;
import com.bdg.bas.yabrakamyan.dto.AccountCreationRequest;
import com.bdg.bas.yabrakamyan.dto.CreditCardCreationRequest;
import com.bdg.bas.yabrakamyan.dto.CustomerCreationRequest;
import com.bdg.bas.yabrakamyan.entity.Account;
import com.bdg.bas.yabrakamyan.entity.CreditCard;
import com.bdg.bas.yabrakamyan.entity.Customer;

public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {
    private final Storage<Account> storage= new MemoryStorage<>(STORAGE_SIZE);
    private final BankAccountBaseService<Customer, CustomerCreationRequest> customerService = new CustomerService();
    private final BankAccountBaseService<CreditCard, CreditCardCreationRequest> creditCardService = (BankAccountBaseService<CreditCard, CreditCardCreationRequest>) new CreditCardService();

    @Override
    public Account create(AccountCreationRequest request) {

        Customer customer = customerService.create(request.customerRequest);
        CreditCard creditCard = creditCardService.create(request.cardRequest);

        Account account = new Account(customer, creditCard, request.balanceRequest.amount);

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
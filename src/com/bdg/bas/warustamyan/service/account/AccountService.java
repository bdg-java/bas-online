package com.bdg.bas.warustamyan.service.account;


import com.bdg.bas.warustamyan.dto.AccountCreationRequest;
import com.bdg.bas.warustamyan.dto.CreditCardCreationRequest;
import com.bdg.bas.warustamyan.dto.CustomerCreationRequest;
import com.bdg.bas.warustamyan.entity.Account;
import com.bdg.bas.warustamyan.entity.CreditCard;
import com.bdg.bas.warustamyan.entity.Customer;
import com.bdg.bas.warustamyan.service.BankAccountBaseService;
import com.bdg.bas.warustamyan.service.creditcard.CreditCardService;
import com.bdg.bas.warustamyan.service.customer.CustomerService;
import com.bdg.bas.warustamyan.storage.MemoryStorage;
import com.bdg.bas.warustamyan.storage.Storage;

/**
 * @author William Arustamyan
 */


public class AccountService implements BankAccountBaseService<Account, AccountCreationRequest> {

    private final Storage<Account> storage = new MemoryStorage<>(STORAGE_SIZE);

    private final BankAccountBaseService<Customer, CustomerCreationRequest> customerService = new CustomerService();
    private final BankAccountBaseService<CreditCard, CreditCardCreationRequest> creditCardService = new CreditCardService();


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

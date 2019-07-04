package com.bdg.bas.ashahbazyan;

import com.bdg.bas.ashahbazyan.entity.Address;
import com.bdg.bas.ashahbazyan.entity.Customer;
import com.bdg.bas.ashahbazyan.storage.MemoryStorage;
import com.bdg.bas.ashahbazyan.storage.Storage;

public class BankAccountSystemApplication {

    public static void main(String[] args) {
        Customer customer = new Customer("aa","bb",new Address());

        Storage<?> storage = new MemoryStorage<>(12);
        //storage.add();
        System.out.println(storage);
    }
}

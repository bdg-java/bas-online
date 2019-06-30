package com.bdg.bas.warustamyan;


import com.bdg.bas.warustamyan.storage.FileStorage;
import com.bdg.bas.warustamyan.storage.Storage;

import java.io.IOException;

/**
 * @author William Arustamyan
 */


public class BankAccountSystemApplication {


    public static void main(String[] args) throws IOException {
        Storage<?> storage = new FileStorage<>("warustamyan", "customer", "dat");
    }
}

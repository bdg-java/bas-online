package com.bdg.bas.natabekyan;

import com.bdg.bas.natabekyan.storage.FileStorage;
import com.bdg.bas.natabekyan.storage.Storage;

import java.io.IOException;

public class BankAccountSystemApplication {
    public static void main(String[] args) throws IOException {
        Storage<?> storage = new FileStorage("natabekyan","customer", "dat" );

    }
}

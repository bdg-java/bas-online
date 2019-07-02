package com.bdg.bas.agharibyan;

import com.bdg.bas.agharibyan.storage.FileStorage;
import com.bdg.bas.agharibyan.storage.Storage;

import java.io.IOException;

public class BankAccountSystemApplication {

    public static void main(String[] args)throws IOException {

        Storage<?> storage = new FileStorage<>("agharibyan", "cutomer", "dat");

    }
}

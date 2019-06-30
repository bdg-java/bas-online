package com.bdg.bas.ahakobyan;

import com.bdg.bas.ahakobyan.entity.AbstractEntity;
import com.bdg.bas.ahakobyan.storage.FileStorage;
import com.bdg.bas.ahakobyan.storage.Storage;

import java.io.IOException;

public class BankAccountSystemApplication {
    public static void main(String[] args) throws IOException {

        Storage<?> storage = new FileStorage<>("ahakobyan","account","dat" );
    }
}

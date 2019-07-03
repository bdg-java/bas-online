package com.bdg.bas.yabrakamyan;

import com.bdg.bas.yabrakamyan.Storage.FileStorage;
import com.bdg.bas.yabrakamyan.Storage.Storage;

import java.io.IOException;

public class BankAccountSystemApplication {

    public static void main(String[] args) throws IOException {
        Storage<?> storage = new FileStorage<>();
    }
}
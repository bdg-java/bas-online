package com.bdg.bas.ahakobyan.service;

import com.bdg.bas.ahakobyan.entity.AbstractEntity;

public interface BankAccountBaseService<T extends AbstractEntity, R> {

    int STORAGE_SIZE = 10;

    T create(R request);
    T get(int id);
    T remove(int id);
}

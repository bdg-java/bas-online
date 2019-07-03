package com.bdg.bas.natabekyan.service;

import com.bdg.bas.natabekyan.entity.AbstractEntity;

public interface BankAccountBaseService<T extends AbstractEntity, R> {

    int STORAGE_SIZE = 10;

    T create(R request);
    T remove(int id);
    T get(int id);
}

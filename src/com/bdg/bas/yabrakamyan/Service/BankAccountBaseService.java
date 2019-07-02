package com.bdg.bas.yabrakamyan.Service;

import com.bdg.bas.yabrakamyan.entity.AbstractBankEntity;

public interface BankAccountBaseService<T extends AbstractBankEntity, R> {

    int STORAGE_SIZE = 10;

    T create(R request);

    T get(int id);

    T remove(int id);
}
package com.bdg.bas.agharibyan.service;

import com.bdg.bas.agharibyan.entity.AbstractBankEntity;

public interface BankAccountBaseService < T extends AbstractBankEntity, R > {

    int STORAGE_SIZE = 10;

    T create (R request);

    T get (int id);

    T remove (int id);

}

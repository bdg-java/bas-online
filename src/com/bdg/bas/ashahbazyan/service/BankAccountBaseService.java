package com.bdg.bas.ashahbazyan.service;

import com.bdg.bas.ashahbazyan.entity.BankEntity;

public interface BankAccountBaseService<T extends BankEntity,R> {
    T create(R request);

}

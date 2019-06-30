package com.bdg.bas.ahakobyan.service;

import com.bdg.bas.ahakobyan.entity.AbstractEntity;

public interface BankAccountBaseService<T extends AbstractEntity, R> {


    T create(R request);
}

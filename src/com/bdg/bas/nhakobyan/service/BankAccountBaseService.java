package com.bdg.bas.nhakobyan.service;

import com.bdg.bas.nhakobyan.entity.AbstractBankEntity;

public interface BankAccountBaseService<T extends AbstractBankEntity ,R> {
    T create(R request);
}

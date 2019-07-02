package com.bdg.bas.asarabyan.entity;

import com.bdg.bas.asarabyan.entity.AbstractBankEntity;

public interface BankAccountBaseService <T extends AbstractBankEntity, R> {


    T create(R request);
}

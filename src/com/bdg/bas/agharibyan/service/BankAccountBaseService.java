package com.bdg.bas.agharibyan.service;

import com.bdg.bas.agharibyan.entity.AbstractBankEntity;

public interface BankAccountBaseService < T extends AbstractBankEntity, R > {

    T create (R request);

}

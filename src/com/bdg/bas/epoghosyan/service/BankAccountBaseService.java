package com.bdg.bas.epoghosyan.service;

import com.bdg.bas.epoghosyan.entity.AbstractBankEntity;

public interface BankAccountBaseService <T extends AbstractBankEntity, R> {

    T create (R requeste);

}

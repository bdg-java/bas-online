package com.bdg.bas.natabekyan.service;

import com.bdg.bas.natabekyan.entity.AbstractEntity;

public interface BankAccuontBaseService<T extends AbstractEntity, R> {

    T create(R request);
}

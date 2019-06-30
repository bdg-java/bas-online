package com.bdg.bas.nhakobyan.storage;

import com.bdg.bas.nhakobyan.entity.AbstractBankEntity;

public interface Storage<T extends AbstractBankEntity> {
    T add(T entity);


    T remove(int id);

    T get(int id);
}

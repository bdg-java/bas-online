package com.bdg.bas.agharibyan.storage;

import com.bdg.bas.agharibyan.entity.AbstractBankEntity;

public interface Storage<T extends AbstractBankEntity> {

    T add (T entity);
    T remove (int id);
    T get (int id);

}

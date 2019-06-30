package com.bdg.bas.ashahbazyan.storage;

import com.bdg.bas.ashahbazyan.entity.BankEntity;

public interface Storage<T extends BankEntity> {
    T add(T entity);

    T remove(int id);

    T get(int id);


}

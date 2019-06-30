package com.bdg.bas.natabekyan.storage;

import com.bdg.bas.natabekyan.entity.AbstractEntity;

public interface Storage<T extends AbstractEntity> {

    T add(T entity);
    T remove(int id);
    T get(int id);

}

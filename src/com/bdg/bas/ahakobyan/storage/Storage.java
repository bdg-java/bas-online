package com.bdg.bas.ahakobyan.storage;

import com.bdg.bas.ahakobyan.entity.AbstractEntity;

public interface Storage<T extends AbstractEntity> {

    T add(T entity);
    T remove(int id);
    T get(int id);
}

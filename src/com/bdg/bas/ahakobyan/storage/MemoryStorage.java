package com.bdg.bas.ahakobyan.storage;

import com.bdg.bas.ahakobyan.entity.AbstractEntity;

public class MemoryStorage<T extends AbstractEntity> implements Storage<T> {

    @Override
    public T add(T entity) {
        return null;
    }

    @Override
    public T remove(int id) {
        return null;
    }

    @Override
    public T get(int id) {
        return null;
    }
}

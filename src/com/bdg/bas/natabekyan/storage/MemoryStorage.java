package com.bdg.bas.natabekyan.storage;

import com.bdg.bas.natabekyan.entity.AbstractEntity;

public class MemoryStorage<T extends AbstractEntity> implements Storage<T> {

    @Override
    public T add(AbstractEntity entity) {
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

package com.bdg.bas.ashahbazyan.storage;

import com.bdg.bas.ashahbazyan.entity.BankEntity;

public class MemoryStorage<T extends BankEntity> implements Storage<T> {
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

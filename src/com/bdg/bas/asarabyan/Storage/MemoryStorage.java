package com.bdg.bas.asarabyan.Storage;

import com.bdg.bas.asarabyan.entity.AbstractBankEntity;

public class MemoryStorage <T extends AbstractBankEntity> implements Storage<T> {

    @Override
    public T add(AbstractBankEntity entity) {
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
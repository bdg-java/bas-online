package com.bdg.bas.yabrakamyan.Storage;

import com.bdg.bas.yabrakamyan.entity.AbstractBankEntity;

public class FileStorage <T extends AbstractBankEntity> implements Storage<T> {
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

package com.bdg.bas.ahakobyan.storage;

import com.bdg.bas.ahakobyan.entity.AbstractEntity;

public class MemoryStorage<T extends AbstractEntity> implements Storage<T> {

    private int currentIndex;
    private AbstractEntity[] store;

    public MemoryStorage(int storageSize) {
        this.store = new AbstractEntity[storageSize];

    }

    @Override
    public T add(T entity) {
        if (this.currentIndex == store.length) {
            increaseSize();
        }
        this.store[currentIndex++] = entity;
        return entity;
    }

    private void increaseSize() {
        AbstractEntity[] tmp = new AbstractEntity[this.store.length + this.store.length / 2];
        System.arraycopy(this.store, 0, tmp, 0, this.store.length);
        this.store = tmp;
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

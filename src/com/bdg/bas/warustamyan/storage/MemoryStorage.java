package com.bdg.bas.warustamyan.storage;


import com.bdg.bas.warustamyan.entity.AbstractBasEntity;

/**
 * @author William Arustamyan
 */


public class MemoryStorage<T extends AbstractBasEntity> implements Storage<T> {

    private int currentIndex;
    private AbstractBasEntity[] store;

    public MemoryStorage(int storageSize) {
        this.store = new AbstractBasEntity[storageSize];
    }

    @Override
    public T add(T entity) {
        if (this.currentIndex == store.length) {
            updateSize();
        }
        this.store[currentIndex++] = entity;
        return entity;
    }

    private void updateSize() {
        AbstractBasEntity[] tmp = new AbstractBasEntity[this.store.length + this.store.length / 2];
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

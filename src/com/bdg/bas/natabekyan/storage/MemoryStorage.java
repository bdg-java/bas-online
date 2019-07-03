package com.bdg.bas.natabekyan.storage;

import com.bdg.bas.natabekyan.entity.AbstractEntity;

public class MemoryStorage<T extends AbstractEntity> implements Storage<T> {

    private AbstractEntity[] store;
    private int currentIndex;

    public MemoryStorage(int storageSize) {
        this.store = new AbstractEntity[storageSize];
    }

    @Override
    public T add(T entity) {
     if (this.currentIndex == store.length) {
         updateSize();
     }
      this.store[currentIndex++] = entity;
        return entity;
    }

    public void updateSize() {
        AbstractEntity[] tmp = new AbstractEntity[this.store.length + this.store.length/2];
        System.arraycopy(this.store, 0, tmp, 0, this.store.length);
        this.store = tmp;
    }

    @Override
    public T remove(int id) {
        AbstractEntity newstore = null;
        for (int i = 0; i < this.store.length; i++) {
            if (id == this.store[i].getId()) {
                this.store[i] = null;
                newstore = this.store[i];
            }
             return (T) newstore;
        }
        return null;
    }

    @Override
    public T get(int id) {
     for (int i = 0; i < this.store.length; i++) {
         if (id == store[i].getId()) {
             return (T) store[i];
         }
     }
        return null;
    }
}

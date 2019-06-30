package com.bdg.bas.agharibyan.storage;

import com.bdg.bas.agharibyan.entity.AbstractBankEntity;

public class MemoryStorage<T extends AbstractBankEntity> implements Storage<T> {

    private AbstractBankEntity[] store;
    private int currentIndex ;

    public MemoryStorage(int storageSize){
        this.store = new AbstractBankEntity[storageSize];
    }

    @Override
    public T add(T entity) {
        if(this.currentIndex == store.length){
            this.incStorageSize();
        }
        this.store[currentIndex++] = entity;
        return entity;
    }

    public void incStorageSize(){
        AbstractBankEntity[] updateStore = new AbstractBankEntity[store.length + store.length/2];
        System.arraycopy(this.store, 0, updateStore, 0, this.store.length);
        this.store = updateStore;
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

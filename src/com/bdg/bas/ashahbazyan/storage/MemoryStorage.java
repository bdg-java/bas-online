package com.bdg.bas.ashahbazyan.storage;

import com.bdg.bas.ashahbazyan.entity.BankEntity;

public class MemoryStorage<T extends BankEntity> implements Storage<T> {
    private BankEntity[] container;
    private int currentStorageIndex;
    private int storageSize;

    public MemoryStorage(int storageSize) {
        this.storageSize = storageSize;
        container = new BankEntity[storageSize];
    }

    @Override
    public T add(T entity) {

        if(storageSize == currentStorageIndex){
                //increase
        }
        this.container[currentStorageIndex] = entity;
        currentStorageIndex++;
        return entity;
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

package com.bdg.bas.agharibyan.storage;

import com.bdg.bas.agharibyan.entity.AbstractBankEntity;

import java.time.LocalDate;

public class MemoryStorage<T extends AbstractBankEntity> implements Storage<T> {

    private AbstractBankEntity[] store;
    private int currentIndex;

    public MemoryStorage(int storageSize){
        this.store = new AbstractBankEntity[storageSize];
    }

    @Override
    public T add(T entity) {
        if (this.currentIndex == store.length){
            this.incStorageSize();
        }
        this.store[currentIndex++] = entity;
        entity.setId(currentIndex+1);            // ete es  service class-neri create methodi mej chem grum setID, ayl return em anelis kanchum em ays add methody, apa es eli yuraqanchyur objecti hamar steghtsum em che id?
        entity.setCreated(LocalDate.now());
        return entity;
    }

    private void incStorageSize(){
        AbstractBankEntity[] updateStore = new AbstractBankEntity[this.store.length + this.store.length/2];
        System.arraycopy(this.store, 0, updateStore, 0, this.store.length);
        this.store = updateStore;
    }

    @Override
    public T remove(int id) {
        return null;
    }

    @Override
    public T get(int id) {
        if(id-1 < currentIndex) {    // karogh enq aystegh mek exception sarqel, vory kkanchi te addressi, te accounti, te creditCardi, te customeri zhamanak, ev anhatakan el chsarqenq.
            return (T) store[id - 1];
        }
        return null;
    }
}

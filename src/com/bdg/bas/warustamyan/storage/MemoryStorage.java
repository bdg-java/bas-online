package com.bdg.bas.warustamyan.storage;


import com.bdg.bas.warustamyan.entity.AbstractBasEntity;

/**
 * @author William Arustamyan
 */


public class MemoryStorage<T extends AbstractBasEntity> implements Storage<T> {


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

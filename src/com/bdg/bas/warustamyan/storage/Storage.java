package com.bdg.bas.warustamyan.storage;


import com.bdg.bas.warustamyan.entity.AbstractBasEntity;

/**
 * @author William Arustamyan
 */


public interface Storage<T extends AbstractBasEntity> {

    T add(T entity);

    T remove(int id);

    T get(int id);
}

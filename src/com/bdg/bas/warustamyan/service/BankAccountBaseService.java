package com.bdg.bas.warustamyan.service;


import com.bdg.bas.warustamyan.entity.AbstractBasEntity;

/**
 * @author William Arustamyan
 */


public interface BankAccountBaseService<T extends AbstractBasEntity, R> {

    int STORAGE_SIZE = 10;

    T create(R request);

    T get(int id);

    T remove(int id);
}

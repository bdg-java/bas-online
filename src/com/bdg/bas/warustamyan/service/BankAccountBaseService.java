package com.bdg.bas.warustamyan.service;


import com.bdg.bas.warustamyan.entity.AbstractBasEntity;

/**
 * @author William Arustamyan
 */


public interface BankAccountBaseService<T extends AbstractBasEntity, R> {

    T create(R request);
}

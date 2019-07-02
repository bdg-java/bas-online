package com.bdg.bas.asarabyan.Storage;


import com.bdg.bas.asarabyan.entity.AbstractBankEntity;

public interface Storage <T extends AbstractBankEntity> {
    T add(T entity);

    T remove(int id);

    T get(int id);
}

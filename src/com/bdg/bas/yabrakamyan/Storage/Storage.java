package com.bdg.bas.yabrakamyan.Storage;

import com.bdg.bas.yabrakamyan.entity.AbstractBankEntity;

public interface Storage<T extends AbstractBankEntity> {

    T add(T entity);
    T remove(int id);
    T get(int id);
}

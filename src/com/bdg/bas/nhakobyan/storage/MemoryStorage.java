package com.bdg.bas.nhakobyan.storage;

import com.bdg.bas.nhakobyan.entity.AbstractBankEntity;

public class MemoryStorage <T extends AbstractBankEntity> implements Storage {

    private int currentIndex;

    @Override
    public AbstractBankEntity add(AbstractBankEntity entity) {
        return null;
    }

    @Override
    public AbstractBankEntity remove(int id) {
        return null;
    }

    @Override
    public AbstractBankEntity get(int id) {
        return null;
    }
}

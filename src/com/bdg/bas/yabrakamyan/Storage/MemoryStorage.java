package com.bdg.bas.yabrakamyan.Storage;

import com.bdg.bas.yabrakamyan.entity.AbstractBankEntity;

public class MemoryStorage<T extends AbstractBankEntity> implements Storage<T> {

        private int currentIndex;
        private AbstractBankEntity[] store;

        public MemoryStorage(int storageSize) {
            this.store = new AbstractBankEntity[storageSize];
        }

        @Override
        public T add(T entity) {
            if (this.currentIndex == store.length) {
                updateSize();
            }
            this.store[currentIndex++] = entity;
            return entity;
        }

        private void updateSize() {
            AbstractBankEntity[] tmp = new AbstractBankEntity[this.store.length + this.store.length / 2];
            System.arraycopy(this.store, 0, tmp, 0, this.store.length);
            this.store = tmp;
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
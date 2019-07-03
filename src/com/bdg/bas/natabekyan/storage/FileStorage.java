package com.bdg.bas.natabekyan.storage;

import com.bdg.bas.natabekyan.entity.AbstractEntity;

import java.io.File;
import java.io.IOException;

public class FileStorage<T extends AbstractEntity> implements Storage<T> {

    private File fStorage;

    public FileStorage (String directory, String name, String extension) throws IOException {
        if (new File(directory).mkdir()) {
            this.fStorage = new File(directory + "/" + name + "." + extension);
            this.fStorage.createNewFile();
        }
    }

    @Override
    public T add(AbstractEntity entity) {
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

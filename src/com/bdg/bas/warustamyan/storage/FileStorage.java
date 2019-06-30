package com.bdg.bas.warustamyan.storage;


import com.bdg.bas.warustamyan.entity.AbstractBasEntity;

import java.io.File;
import java.io.IOException;

/**
 * @author William Arustamyan
 */


public class FileStorage<T extends AbstractBasEntity> implements Storage<T> {

    private File fStorage;

    public FileStorage(String directory, String name, String extension) throws IOException {
        if (new File(directory).mkdir()) {
            this.fStorage = new File(directory + "/" + name + "." + extension);
            this.fStorage.createNewFile();
        }
    }


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

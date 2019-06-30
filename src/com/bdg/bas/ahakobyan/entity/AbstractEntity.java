package com.bdg.bas.ahakobyan.entity;

import java.time.LocalDate;

public abstract class AbstractEntity {

    protected int id;
    protected LocalDate created;
    protected LocalDate updated;
    protected LocalDate deleted;
}

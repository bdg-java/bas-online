package com.bdg.bas.natabekyan.entity;

import java.time.LocalDate;

public abstract class AbstractEntity {
    protected int id;
    protected LocalDate created;
    protected LocalDate deleted;
    protected LocalDate updated;

}

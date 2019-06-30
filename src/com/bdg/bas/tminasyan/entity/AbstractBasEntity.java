package com.bdg.bas.tminasyan.entity;

import java.time.LocalDate;

public abstract class AbstractBasEntity {
    protected int id;
    protected LocalDate crated;
    protected LocalDate updated;
    protected LocalDate deleted;

}

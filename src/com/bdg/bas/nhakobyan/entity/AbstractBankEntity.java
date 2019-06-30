package com.bdg.bas.nhakobyan.entity;

import java.time.LocalDate;

public abstract class AbstractBankEntity {
    protected int id;
    protected LocalDate created;
    protected LocalDate updated;
    protected LocalDate deleted;
}

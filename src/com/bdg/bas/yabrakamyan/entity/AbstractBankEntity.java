package com.bdg.bas.yabrakamyan.entity;

import java.time.LocalDate;

public abstract class AbstractBankEntity {

    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;
    protected LocalDate deleted;
}

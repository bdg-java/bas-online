package com.bdg.bas.warustamyan.entity;


import java.time.LocalDate;

/**
 * @author William Arustamyan
 */


public abstract class AbstractBasEntity {

    protected int id;
    protected LocalDate created;
    protected LocalDate updated;
    protected LocalDate deleted;
}

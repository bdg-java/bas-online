package com.bdg.bas.warustamyan.common;


/**
 * @author William Arustamyan
 */


public enum  Country {

    ARM("Armenia"), RU("Russia");


    private String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public static Country findByName(String countryName) {
        return ARM;
    }
}

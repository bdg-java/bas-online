package com.bdg.bas.nhakobyan.common;

public enum Country {
    Arm("Armenia"), Rus("Russia");


    protected String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }
}

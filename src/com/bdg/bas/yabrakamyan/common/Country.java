package com.bdg.bas.yabrakamyan.common;

public enum Country {
    ARM("ARM"), RU("RUS");


    private String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public static Country findByName(String countryName) {
        return ARM;
    }
}

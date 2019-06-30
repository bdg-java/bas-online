package com.bdg.bas.epoghosyan.common;

public enum Country {

    AM("Armenia", "051");

    String countryName;
    String numbericCode;

    Country(String countryName, String numbericCode) {
        this.countryName = countryName;
        this.numbericCode = numbericCode;
    }
}

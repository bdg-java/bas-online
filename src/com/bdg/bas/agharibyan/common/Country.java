package com.bdg.bas.agharibyan.common;

public enum Country {

    ARM("Armenia"),
    RU("Russia");

    private String countryName;

    Country (String countryName){
        this.countryName = countryName;
    }

    public static Country findByName(String countryName){
        Country found = null;
        for(Country value:values()){
            if(value.name().equalsIgnoreCase(countryName)){
                found = value;
            }
        }
        if(found != null){ //heto havanabar kavelacnenq exception
            return found;
        }
        return null;
    }
}

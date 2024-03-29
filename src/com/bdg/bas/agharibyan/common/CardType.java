package com.bdg.bas.agharibyan.common;

public enum CardType {

    VISA,
    MASTERCARD,
    AMERICANEXPRESS,
    ARCA;

    public static CardType find(String cardType){
        CardType found = null;
        for(CardType value:values()){
            if(value.name().equalsIgnoreCase(cardType)){
                found = value;
            }
        }
        return found;
    }
}

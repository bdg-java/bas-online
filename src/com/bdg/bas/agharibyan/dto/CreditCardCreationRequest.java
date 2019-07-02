package com.bdg.bas.agharibyan.dto;

import java.time.LocalDate;

public class CreditCardCreationRequest {

    public int accountID;
    public String cardNumber;
    public LocalDate expDate;
    public int code;
    public String cardType; // Williami mot miayn ays fieldn e, myusnery es em avelacrel.

    public CreditCardCreationRequest(int accountID, String cardNumber, LocalDate expDate, int code, String cardType){
        this.accountID = accountID;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.code = code;
        this.cardType = cardType;
    }
}

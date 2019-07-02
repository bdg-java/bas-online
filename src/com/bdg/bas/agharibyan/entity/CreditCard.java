package com.bdg.bas.agharibyan.entity;

import com.bdg.bas.agharibyan.common.CardType;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity{

    private int accountID;
    private String cardNumber;
    private LocalDate expDate;
    private int code;
    private CardType cardType;

    public CreditCard(int accountID, String cardNumber, LocalDate expDate, int code, CardType cardType){
        this.accountID = accountID;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.code = code;
        this.cardType = cardType;
    }
}

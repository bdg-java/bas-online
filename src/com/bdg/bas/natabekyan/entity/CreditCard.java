package com.bdg.bas.natabekyan.entity;

import com.bdg.bas.natabekyan.common.CardType;

import java.time.LocalDate;

public class CreditCard extends AbstractEntity {

    private int accountId;
    private CardType cardType;
    private String cardNumber;
    private LocalDate expDate;
    private int CVV;

    public CreditCard(int accountId, CardType cardType, String cardNumber, LocalDate expDate, int CVV) {
        this.accountId = accountId;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.CVV = CVV;
    }
}

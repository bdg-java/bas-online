package com.bdg.bas.nhakobyan.entity;

import com.bdg.bas.nhakobyan.common.CardType;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity {
    protected int accountId;
    protected String cardNumber;
    protected LocalDate expDate;
    protected int code;

    public CreditCard(int accountId, String cardNumber, LocalDate expDate, int code) {
        this.accountId = accountId;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.code = code;
    }
}

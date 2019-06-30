package com.bdg.bas.yabrakamyan.entity;

import com.bdg.bas.yabrakamyan.common.CardType;

public class CreditCard extends AbstractBankEntity {

    private int cardNumber;
    private int expDate;
    private int code;
    private CardType type;

    public CreditCard(int cardNumber, int expDate, int code, CardType type) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.code = code;
        this.type = type;
    }
}

package com.bdg.bas.yabrakamyan.dto;

import com.bdg.bas.yabrakamyan.common.CardType;

public class CreditCardCreationRequest {

    public String cardType;

    public CreditCardCreationRequest(String cardType) {
        this.cardType = cardType;
    }
}

package com.bdg.bas.agharibyan.entity;

import com.bdg.bas.agharibyan.common.CardType;

public class CreditCard extends AbstractBankEntity{

    private CardType cardType;

    public CreditCard(CardType cardType){
        this.cardType = cardType;
    }
}

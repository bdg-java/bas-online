package com.bdg.bas.agharibyan.entity;

import com.bdg.bas.agharibyan.common.CardType;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity{

    private int accountID;
    private String cardNumber;
    private LocalDate expDate;
    private int code;
    private CardType cardType;

}

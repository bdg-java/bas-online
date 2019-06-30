package com.bdg.bas.ahakobyan.entity;

import com.bdg.bas.ahakobyan.common.CardType;

import java.time.LocalDate;

public class CreditCard extends AbstractEntity {

    private int accountId;
    private String cardNumber;
    private LocalDate expDate;
    private int code;
    private CardType cardType;
}

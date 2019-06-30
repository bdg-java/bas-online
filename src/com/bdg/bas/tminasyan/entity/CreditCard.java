package com.bdg.bas.tminasyan.entity;

import com.bdg.bankaccountsystem.CardType;

import java.time.LocalDate;

public class CreditCard extends AbstractBasEntity {

    private int accountId;
    private String cardNumber;
    private LocalDate expDate;
    private int code;
    private CardType cardType;



}

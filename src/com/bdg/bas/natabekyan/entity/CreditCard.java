package com.bdg.bas.natabekyan.entity;

import com.bdg.bas.natabekyan.common.CardType;

import java.time.LocalDate;

public class CreditCard extends AbstractEntity {

    private int accountId;
    private CardType cardType;
    private String cardNumber;
    private LocalDate expDate;
    private int cvv;

}

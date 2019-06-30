package com.bdg.bas.nhakobyan.entity;

import com.bdg.bas.nhakobyan.common.CardType;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity {
    protected int accountId;
    protected String cardtNumber;
    protected LocalDate expDate;
    protected int code;
}

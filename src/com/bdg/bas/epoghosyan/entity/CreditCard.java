package com.bdg.bas.epoghosyan.entity;

import com.bdg.bas.ashahbazyan.entity.BankEntity;
import com.bdg.bas.epoghosyan.common.CardType;

import java.time.LocalDate;

public class CreditCard  extends BankEntity {
    private int accountId;
    private String cardNumber;
    private LocalDate expDate;
    private int cvvCode;
    private CardType cardType;

}

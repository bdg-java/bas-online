package com.bdg.bas.asarabyan.entity;

import java.time.LocalDate;
import com.bdg.bas.asarabyan.common.CardType;

public class CreditCard extends AbstractBankEntity {
    private int accountId;
    private String cardNumber;
    private LocalDate expDate;
    private int code;
}

package com.bdg.bas.warustamyan.entity;


import com.bdg.bas.warustamyan.common.CardType;

import java.time.LocalDate;

/**
 * @author William Arustamyan
 */


public class CreditCard extends AbstractBasEntity {

    private CardType cardType;
    private int accountId;
    private String cardNumber;
    private LocalDate expDate;
    private int code;

}

package com.bdg.bas.epoghosyan.entity;

<<<<<<< Updated upstream
import com.bdg.bas.ashahbazyan.entity.BankEntity;
=======
>>>>>>> Stashed changes
import com.bdg.bas.epoghosyan.common.CardType;

import java.time.LocalDate;

<<<<<<< Updated upstream
public class CreditCard  extends BankEntity {
    private int accountId;
    private String cardNumber;
    private LocalDate expDate;
    private int cvvCode;
    private CardType cardType;

=======
public class CreditCard extends AbstractBankEntity {

    private int accountId;
    private String cardNumber;
    private LocalDate expDate;
    private int CVV;
    private CardType cardType;

    public CreditCard(int accountId, String cardNumber, LocalDate expDate, int CVV, CardType cardType) {
        this.accountId = accountId;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.CVV = CVV;
        this.cardType = cardType;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
>>>>>>> Stashed changes
}

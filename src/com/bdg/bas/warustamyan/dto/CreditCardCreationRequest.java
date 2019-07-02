package com.bdg.bas.warustamyan.dto;


/**
 * @author William Arustamyan
 */


public class CreditCardCreationRequest {

    public String cardType;
    // questions from Ani
    //myus fieldery petq chen aystegh grel?
    // dto-um bolor fieldery dardznum enq public vorqan haskaca?
    // inchu chenq miangamic entityi packageneri mej grum public?

    public CreditCardCreationRequest(String cardType) {
        this.cardType = cardType;
    }
}

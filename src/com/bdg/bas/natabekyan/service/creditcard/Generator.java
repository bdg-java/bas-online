package com.bdg.bas.natabekyan.service.creditcard;

import java.util.Random;

public class Generator {
    private static final char[] CARDNUMBER = ("0123456789").toCharArray();
    private static final char[] CVV = ("0123456789").toCharArray();

    public String generateCardNumber(int lenght) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i<lenght; i++) {
            result.append(CARDNUMBER[new Random().nextInt(CARDNUMBER.length)]);
        }
        return result.toString();
    }

    public String generateCVV(int lenght) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i<lenght; i++) {
            result.append(CVV[new Random().nextInt(CVV.length)]);
        }
        return result.toString();
    }

}

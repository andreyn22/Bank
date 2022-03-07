package main.java.ro.sci.domain;

import java.util.ArrayList;
import java.util.List;

public class Account {

    String IBAN;
    double balance;
    List<String> attachedCardNumbers = new ArrayList<>();


    void attachCard(String cardNumber) {
        this.attachedCardNumbers.add(cardNumber);
    }


    @Override
    public String toString() {
        return "Account{" +
                "IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                ", attachedCardNumbers=" + attachedCardNumbers +
                '}';
    }
}

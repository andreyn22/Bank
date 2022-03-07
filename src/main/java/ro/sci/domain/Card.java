package main.java.ro.sci.domain;

import java.util.Date;

public class Card {

    Date expiration;
    String ownerName;
    String cardNumber;

    @Override
    public String toString() {
        return "Card{" +
                "expiration=" + expiration +
                ", ownerName='" + ownerName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}

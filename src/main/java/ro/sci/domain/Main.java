package main.java.ro.sci.domain;

import main.java.ro.sci.domain.User;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

/////////////////////////////////////////////////////////////////////////// create user Cristian
        User cristian = new User();
        cristian.firstName = "Cristian";

/////////////////////////////////////////////////////////////////////////// create user Dragos
        User dragos = new User();
        dragos.firstName = "Dragos";

/////////////////////////////////////////////////////////////////////////// create card for Dragos
        Card card1 = new Card();
        card1.cardNumber = "123";
        card1.expiration = new Date();
        card1.ownerName = "Dragos card 1";

/////////////////////////////////////////////////////////////////////////// create second card for Dragos
        Card card2 = new Card();
        card2.cardNumber = "456";
        card2.expiration = new Date();
        card2.ownerName = "Dragos card 2";

// add cards to Dragos
        dragos.addCard(card1);
        dragos.addCard(card2);

        Card card3 = new Card();
        card3.cardNumber = "789";
        card3.expiration = new Date();
        card3.ownerName = "Cristi card 1";

        cristian.addCard(card3);

        Account account1 = new Account();
        account1.IBAN = "acount1 IBAN";
        account1.balance = 500;
        account1.attachCard(card2.cardNumber);

        dragos.addAccount(account1);

        Pos pos = new Pos();
        pos.addKnownBankAccount(account1.IBAN);

        System.out.println(cristian);
        System.out.println(dragos);

        // ToDo: Identify account based on card number
        System.out.println("buy diesel for 200");
        pos.pay(account1, 200);

        System.out.println(dragos);

        System.out.println("Buy cherries for 350");
        pos.pay(account1, 350);

        System.out.println(dragos);

        System.out.println("Remove card 1 for Dragos");
        dragos.removeCard(card1);
        System.out.println(dragos);
    }
}

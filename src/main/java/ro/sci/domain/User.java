package main.java.ro.sci.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    String firstName;
    String lastName;
    List<Card> cards = new ArrayList<>();
    List<Account> accounts = new ArrayList<>();

    /*
     * Adds {@param card} to the list of cars of the user
     * @param card with information
     */

    void addCard(Card card) {

        this.cards.add(card);
    }

    void addAccount(Account account) {
        this.accounts.add(account);
    }

    void removeCard(Card card) {
        this.cards.remove(card);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cards=" + cards +
                ", accounts=" + accounts +
                '}';
    }
}


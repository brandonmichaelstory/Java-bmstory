/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author micha
 */

enum Suit {
    DIAMONDS, HEARTS, CLUBS, SPADES;
}

class Card {
    
    private int value; //card integer value
    private String cardName;
    private Suit suit;
    public Card(int cardIndex, Suit suit) {
        
        this.value = setValue(cardIndex); // card index being the number to represent the card ex. Ace index = 1
        this.cardName = getName(cardIndex);
        this.suit = suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getName(int cardIndex) {
        
        switch (cardIndex) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return Integer.toString(cardIndex);
        }
    }
    
    public int setValue(int cardIndex) {
        
        if (cardIndex <= 9) {
            return cardIndex;
        }
        else {
            return 10;
        }
    }
    
    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append(this.cardName);
        switch (suit) {
            case DIAMONDS:
                s.append("D");
                break;
            case CLUBS:
                s.append("C");
                break;
            case HEARTS:
                s.append("H");
                break;
            case SPADES:
                s.append("S");
                break;
            }
        return s.toString();
    }
    
}

class Deck {
    
    Random rand = new Random();
    private ArrayList<Card> deck = new ArrayList<>();
    public Deck() {
    
        buildDeck();
    }
    
    private void buildDeck() {
        
        for (Suit s : Suit.values()) {
            
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, s));
            }
        }
    }
    
    public Card hit() {
        
        int index = rand.nextInt(deck.size());
        Card c = deck.get(index);
        deck.remove(index);
        return c;
    }
}

class Player {
    
    ArrayList<Card> hand = new ArrayList<>();
    private int total = 0;
    public Player(Card c1, Card c2) {
        
        hand.add(c1);
        hand.add(c2);
        this.total = hand.get(0).getValue() + hand.get(1).getValue();
    }
    
    public int getTotal() {
        return this.total;
    }
    
    public void updateTotal(Card c) {
        this.total += c.getValue();
    }
    
    public void draw(Card c) {
        
        updateTotal(c);
        hand.add(c);
    }
    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        
        for (var c : hand) {
            
            s.append(c.toString());
            s.append(" ");
        }
        
        return s.toString();
    }
}
public class Game {
    
    public static void main(String[] args) {
        
        Card c1 = new Card(1, Suit.DIAMONDS);
        Card c2 = new Card(4, Suit.DIAMONDS);
        Player player = new Player(c1, c2);
        System.out.println(player.toString());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject;

/**
 *
 * @author micha
 */
public class Card {

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
        
        if (cardIndex > 1 && cardIndex <= 9) {
            return cardIndex;
        }
        else if (cardIndex == 1) {
            return 11;
        }
        else {
            return 10;
        }
    }
    
    public String getCardName() {
        return this.cardName;
    }
    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append(this.cardName);
        switch (suit) {
            case DIAMONDS:
                s.append("H");
                break;
            case CLUBS:
                s.append("H");
                break;
            case HEARTS:
                s.append("H");
                break;
            case SPADES:
                s.append("H");
                break;
            }
        return s.toString();
    }
}

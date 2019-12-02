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
class Card {
    
    private int value; //card integer value
    private String cardName;
    public Card(int cardIndex) {
        
        this.value = setValue(cardIndex); // card index being the number to represent the card ex. Ace index = 1
        this.cardName = getName(cardIndex);
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
    
}
public class Game {
    
    public static void main(String[] args) {
        
        Card c = new Card(11);
        System.out.println(Integer.toString(c.getValue()) + c.getName(11));
    }
}

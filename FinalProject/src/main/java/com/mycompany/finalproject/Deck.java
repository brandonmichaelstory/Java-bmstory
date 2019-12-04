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
public class Deck {
    
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

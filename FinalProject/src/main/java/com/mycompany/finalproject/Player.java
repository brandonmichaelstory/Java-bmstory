/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject;

import java.util.ArrayList;

/**
 *
 * @author micha
 */
public class Player {
    
    ArrayList<Card> hand = new ArrayList<>();
    private int total = 0;
    //private boolean hasAce = false;
    public int aceCount = 0;
    public Player(Card c1, Card c2) {
        
        if (c1.getCardName().equals("A")) {
            aceCount++;
        }
        if (c2.getCardName().equals("A")) {
            aceCount++;
        }
        hand.add(c1);
        hand.add(c2);
        updateTotal(c1);
        updateTotal(c2);
    }
    
    public int getTotal() {
        return this.total;
    }
    
    public void updateTotal(Card c) {
        total += c.getValue();
        while (total > 21 && aceCount > 0) {
            this.total -= 10;
            aceCount--;
        }
    }
    
    public void draw(Card c) {
        
        if (c.getCardName().equals("A")) {
            aceCount++;
        }
        hand.add(c);
        updateTotal(c);
    }
    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        
        for (var c : hand) {
            
            s.append(c.toString());
            s.append(" ");
        }
        return s.toString().trim();
    }
}

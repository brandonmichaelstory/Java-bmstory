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

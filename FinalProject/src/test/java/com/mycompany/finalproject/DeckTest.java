/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject;

import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author micha
 */
public class DeckTest {
    
    public DeckTest() {
    }

    /**
     * Test of hit method, of class Deck.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Deck instance = new Deck();
        int numberOfCards = instance.getNumberOfCards();
        assertEquals(numberOfCards, instance.getNumberOfCards());
        instance.hit();
        assertEquals(numberOfCards - 1, instance.getNumberOfCards());
    }
    
}

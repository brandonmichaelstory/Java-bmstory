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

///make sure to fix the test because it fails on the toString because all cards are considered hearts
public class CardTest {
    
    public CardTest() {
    }
    
    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance1 = new Card(1, Suit.DIAMONDS);
        Card instance2 = new Card(3, Suit.CLUBS);
        int expResult1 = 11;
        int expResult2 = 3;
        assertEquals(expResult1, instance1.getValue());
        assertEquals(expResult2, instance2.getValue());
    }

    /**
     * Test of getName method, of class Card.
     */
    @Test
    public void testCreateName() {
        System.out.println("getName");
        Card instance1 = new Card(1, Suit.DIAMONDS);
        Card instance2 = new Card(3, Suit.CLUBS);
        String expResult1 = "A";
        String expResult2 = "3";
        assertEquals(expResult1, instance1.getCardName());
        assertEquals(expResult2, instance2.getCardName());
    }

    /**
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Card instance1 = new Card(1, Suit.DIAMONDS);
        Card instance2 = new Card(3, Suit.CLUBS);
        int expResult1 = 11;
        int expResult2 = 3;
        
        assertEquals(expResult1, instance1.getValue());
        assertEquals(expResult2, instance2.getValue());
    }

    /**
     * Test of getCardName method, of class Card.
     */
    @Test
    public void testGetCardName() {
        
        Card instance1 = new Card(1, Suit.DIAMONDS);
        Card instance2 = new Card(3, Suit.CLUBS);
        String expResult1 = "A";
        String expResult2 = "3";
        assertEquals(expResult1, instance1.getCardName());
        assertEquals(expResult2, instance2.getCardName());
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance1 = new Card(1, Suit.DIAMONDS);
        Card instance2 = new Card(3, Suit.CLUBS);
        assertEquals("AD", instance1.toString());
        assertEquals("3C", instance2.toString());
    }
    
}

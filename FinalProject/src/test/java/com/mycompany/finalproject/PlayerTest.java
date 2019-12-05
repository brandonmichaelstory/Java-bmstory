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
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    /**
     * Test of getTotal method, of class Player.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Card c1 = new Card(1, Suit.HEARTS);
        Card c2 = new Card(11, Suit.CLUBS);
        Player p1 = new Player(c1, c2);
        int expResult = 21;
        assertEquals(expResult, p1.getTotal());
    }

    /**
     * Test of updateTotal method, of class Player.
     */
    @Test
    public void testUpdateTotal() {
        System.out.println("updateTotal");
        Card c1 = new Card(1, Suit.HEARTS);
        Card c2 = new Card(11, Suit.CLUBS);
        Player p1 = new Player(c1, c2);
        Card c3 = new Card(1, Suit.DIAMONDS);
        p1.draw(c3);
        int expResult = 12;
        assertEquals(expResult, p1.getTotal());
    }

    /**
     * Test of draw method, of class Player.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Card c1 = new Card(2, Suit.HEARTS);
        Card c2 = new Card(5, Suit.CLUBS);
        Player p1 = new Player(c1, c2);
        Card c3 = new Card(1, Suit.DIAMONDS);
        assertEquals(2, p1.hand.size());
        assertEquals(0, p1.aceCount);
        p1.draw(c3);
        assertEquals(3, p1.hand.size());
        assertEquals(1, p1.aceCount);
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card c1 = new Card(2, Suit.HEARTS);
        Card c2 = new Card(5, Suit.CLUBS);
        Player p1 = new Player(c1, c2);
        Card c3 = new Card(1, Suit.DIAMONDS);
        String expResult = "2H 5C AD";
        assertEquals(expResult, p1.toString());
    }
    
}

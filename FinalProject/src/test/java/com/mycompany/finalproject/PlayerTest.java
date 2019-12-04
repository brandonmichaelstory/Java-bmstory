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
        Player instance = null;
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTotal method, of class Player.
     */
    @Test
    public void testUpdateTotal() {
        System.out.println("updateTotal");
        Card c = null;
        Player instance = null;
        instance.updateTotal(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Player.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Card c = null;
        Player instance = null;
        instance.draw(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

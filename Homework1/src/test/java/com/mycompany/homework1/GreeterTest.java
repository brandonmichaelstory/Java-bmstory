/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework1;

import org.junit.*;
import static org.junit.Assert.*;


/**
 *
 * @author micha
 */
public class GreeterTest {

    /**
     * Test of getGreeting method, of class Greeter.
     */
    @Test
    public void testGetGreetingNoCurrent() {
        //System.out.println("getGreeting");
        Greeter instance = new Greeter();
        String expResult = "Hello World!";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGreeting method, of class Greeter.
     */
    @Test
    public void testSetGreeting() {
        System.out.println("setGreeting");
        String greeting = "";
        Greeter instance = new Greeter();
        instance.setGreeting(greeting);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

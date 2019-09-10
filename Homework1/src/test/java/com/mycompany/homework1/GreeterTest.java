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
    public void testGetCurrentGreetingNoCurrent() {
        //System.out.println("getGreeting");
        Greeter instance = new Greeter();
        String expResult = "Hello World!";
        String result = instance.getCurrentGreeting();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCurrentGreetingWithCurrent() {
        //System.out.println("getGreeting");
        Greeter instance = new Greeter();
        String expResult = "Howdy!";
        instance.setCurrentGreeting(expResult);
        String result = instance.getCurrentGreeting();
        assertEquals(expResult, result);
    }
    /**
     * Test of setGreeting method, of class Greeter.
     */
    @Test
    public void testSetCurrentGreeting() {
        //System.out.println("setGreeting");
        String greeting = "Hey There!";
        Greeter instance = new Greeter();
        instance.setCurrentGreeting(greeting);
        String expResult = instance.getCurrentGreeting();
        assertEquals(expResult, greeting);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testGreetingsArrayList() {
        //System.out.println("setGreeting");
        //String greeting = "Hey There!";
        Greeter instance = new Greeter();
        int size = instance.Greetings.size();
        String testString = "Howdy!";
        instance.setCurrentGreeting(testString);
        assertEquals(size + 1, instance.Greetings.size());
        assertEquals(testString, instance.Greetings.get(size));
        //assertEquals(expResult, greeting);
        // TODO review the generated test code and remove the default call to fail.
    }
}

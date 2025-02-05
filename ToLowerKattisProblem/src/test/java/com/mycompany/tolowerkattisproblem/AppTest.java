/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tolowerkattisproblem;

import java.util.Scanner;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class AppTest {

    @Test
    public void testFixable() {
        String text = "Hello";
        App instance = new App();
        boolean expResult = true;
        assertEquals(expResult, instance.fixable(text));
        text = "HELlo";
        expResult = false;
        assertEquals(expResult, instance.fixable(text));
        text = "hEllo";
        assertEquals(expResult, instance.fixable(text));
    }

    
    @Test
    public void testTestProblemSet() {
        ArrayList<String> lines1 = new ArrayList<String>();
        lines1.add("bYe");
        lines1.add("Hello");
        lines1.add("hehe");
        App instance = new App();
        boolean expResult = false;
        assertEquals(expResult, instance.testProblemSet(3, lines1));
        ArrayList<String> lines2 = new ArrayList<String>();
        lines2.add("hey");
        expResult = true;
        assertEquals(expResult, instance.testProblemSet(1, lines2));
        ArrayList<String> lines3 = new ArrayList<String>();
        lines3.add("bye");
        lines3.add("Hello");
        lines3.add("hehe");
        lines3.add("HOwdy");
        expResult = false;
        assertEquals(expResult, instance.testProblemSet(4, lines3));
    }

    /**
     * Test of run method, of class App.
     */
    @Test public void testReadData() {
        App instance = new App();
        instance.in = new Scanner("3 1" + System.lineSeparator());
        instance.ReadData();
        int expP = 3, expT = 1;
        int expPT = expP * expT;
        assertEquals(expP, instance.P);
        assertEquals(expT, instance.T);
        assertEquals(expPT, instance.PT);
    }
    
    @Test
    public void testRun() {
        App instance = new App();
        instance.in = new Scanner("2 2" + System.lineSeparator() + "abc" + 
                System.lineSeparator() + "Def" + System.lineSeparator() + "DDG" +
                System.lineSeparator() + "add");
        int expResult = 1;
        int result = instance.run();
        assertEquals(expResult, result);
    }
    
    
    
}

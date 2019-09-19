/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tolowerkattisproblem;


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
   /* @Test
    public void testRun() {
        System.out.println("run");
        App instance = new App();
        int expResult = 0;
        int result = instance.run();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    */
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carfactorythreads;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class PaintColorTest {
    
    public PaintColorTest() {
    }
    
    /**
     * Test of values method, of class PaintColor.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        PaintColor r = PaintColor.RED;
        PaintColor b = PaintColor.BLACK;
        PaintColor w = PaintColor.WHITE;
        
        assertEquals(r, PaintColor.RED);
        assertEquals(b, PaintColor.BLACK);
        assertEquals(w, PaintColor.WHITE);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class PaintColor.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String arg0 = "";
        PaintColor expResult = null;
        PaintColor result = PaintColor.valueOf(arg0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

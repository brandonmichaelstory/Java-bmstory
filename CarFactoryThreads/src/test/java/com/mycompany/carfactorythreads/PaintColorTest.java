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
       
    }
    
}

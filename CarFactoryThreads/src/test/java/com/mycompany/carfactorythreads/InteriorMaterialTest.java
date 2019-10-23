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
public class InteriorMaterialTest {
    
    public InteriorMaterialTest() {
    }
    
    /**
     * Test of values method, of class InteriorMaterial.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        InteriorMaterial l = InteriorMaterial.LEATHER;
        InteriorMaterial s = InteriorMaterial.SUEDE;
        InteriorMaterial v = InteriorMaterial.VINYL;
        assertEquals(l, InteriorMaterial.LEATHER);
        assertEquals(s, InteriorMaterial.SUEDE);
        assertEquals(v, InteriorMaterial.VINYL);
    }
}

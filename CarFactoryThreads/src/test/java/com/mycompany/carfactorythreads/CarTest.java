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
public class CarTest {
    
    public CarTest() {
    }
    
    /**
     * Test of getPaint method, of class Car.
     */
    @Test
    public void testGetPaint() {
        System.out.println("getPaint");
        Car instance = new Car(PaintColor.BLACK, InteriorMaterial.VINYL);
        PaintColor expResult = PaintColor.BLACK;
        PaintColor result = instance.getPaint();
        assertEquals(expResult, result);
    }

    /**
     * Test of getInterior method, of class Car.
     */
    @Test
    public void testGetInterior() {
        System.out.println("getInterior");
        Car instance = new Car(PaintColor.BLACK, InteriorMaterial.VINYL);
        InteriorMaterial expResult =InteriorMaterial.VINYL;
        InteriorMaterial result = instance.getInterior();
        assertEquals(expResult, result);
    }
    
}

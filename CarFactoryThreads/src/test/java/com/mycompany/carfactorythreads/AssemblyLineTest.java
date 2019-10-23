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
public class AssemblyLineTest {
    
    public AssemblyLineTest() {
        
    }
    
    /**
     * Test of buildCar method, of class AssemblyLine.
     */
    @Test
    public void testBuildCar() {
        System.out.println("buildCar");
        Factory f1 = new Factory(1);
        AssemblyLine instance = new AssemblyLine(f1, PaintColor.RED, InteriorMaterial.LEATHER);
        instance.buildCar();
        PaintColor expColor = PaintColor.RED;
        InteriorMaterial expMaterial = InteriorMaterial.LEATHER;
        Car resultCar = f1.inventory.get(0);
        assertEquals(expColor, resultCar.getPaint());
        assertEquals(expMaterial, resultCar.getInterior());
    }
    
}

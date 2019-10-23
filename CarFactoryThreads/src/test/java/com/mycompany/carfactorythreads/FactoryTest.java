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
public class FactoryTest {
    
    public FactoryTest() {
    }
    /**
     * Test of main method, of class Factory.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Factory.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFinishedCars method, of class Factory.
     */
    @Test
    public void testGetFinishedCars() {
        System.out.println("getFinishedCars");
        Factory instance = new Factory(3);
        AssemblyLine l = new AssemblyLine(instance, PaintColor.WHITE, InteriorMaterial.VINYL);
        l.buildCar();
        l.buildCar();
        l.buildCar();
        int expResult = 3;
        int result = instance.getFinishedCars();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateFinishedCars method, of class Factory.
     */
    @Test
    public void testUpdateFinishedCars() {
        System.out.println("updateFinishedCars");
        Factory instance = new Factory(1);
        instance.updateFinishedCars();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateInventory method, of class Factory.
     */
    @Test
    public void testUpdateInventory() {
        System.out.println("updateInventory");
        Car c = null;
        Factory instance = new Factory(1);
        instance.updateInventory(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of production method, of class Factory.
     */
    @Test
    public void testProduction() {
        System.out.println("production");
        Factory instance = new Factory(1);
        instance.production();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Factory.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        int number = 0;
        Factory instance = new Factory(1);
        PaintColor expResult = null;
        PaintColor result = instance.getColor(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaterial method, of class Factory.
     */
    @Test
    public void testGetMaterial() {
        System.out.println("getMaterial");
        int number = 0;
        Factory instance = new Factory(1);
        InteriorMaterial expResult = null;
        InteriorMaterial result = instance.getMaterial(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

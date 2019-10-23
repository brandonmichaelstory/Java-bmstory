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
        int expResult = instance.getFinishedCars() + 1;
        //AssemblyLine l = new AssemblyLine(instance, PaintColor.BLACK, InteriorMaterial.LEATHER);
        //l.buildCar();
        instance.updateFinishedCars();
        assertEquals(expResult, instance.getFinishedCars());
    }

    /**
     * Test of updateInventory method, of class Factory.
     */
    @Test
    public void testUpdateInventory() {
        System.out.println("updateInventory");
        Car c = new Car(PaintColor.BLACK, InteriorMaterial.SUEDE);
        Factory instance = new Factory(1);
        instance.updateInventory(c);
        Car resultCar = instance.inventory.get(0);
        assertEquals(PaintColor.BLACK, resultCar.getPaint());
        assertEquals(InteriorMaterial.SUEDE, resultCar.getInterior());
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
        Factory instance = new Factory(1);
        assertEquals(PaintColor.RED, instance.getColor(0));
        assertEquals(PaintColor.BLACK, instance.getColor(1));
        assertEquals(PaintColor.WHITE, instance.getColor(2));
    }

    /**
     * Test of getMaterial method, of class Factory.
     */
    @Test
    public void testGetMaterial() {
        System.out.println("getMaterial");
        Factory instance = new Factory(1);
        assertEquals(InteriorMaterial.LEATHER, instance.getMaterial(0));
        assertEquals(InteriorMaterial.SUEDE, instance.getMaterial(1));
        assertEquals(InteriorMaterial.VINYL, instance.getMaterial(2));
    }
    
}

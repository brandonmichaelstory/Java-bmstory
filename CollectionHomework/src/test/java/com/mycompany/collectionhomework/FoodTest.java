/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionhomework;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class FoodTest {
    
    public FoodTest() {
    }
    
    @Test
    public void testGetCalories() {
        System.out.println("getCalories");
        Food instance = new Food(210);
        int expResult = 210;
        int result = instance.getCalories();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProtein method, of class Food.
     */
    @Test
    public void testGetProtein() {
        System.out.println("getProtein");
        Food instance = new Food(210, 5, 21, 3);
        int expResult = 5;
        int result = instance.getProtein();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCarbs method, of class Food.
     */
    @Test
    public void testGetCarbs() {
        System.out.println("getCarbs");
        Food instance = new Food(127, 2, 40, 0);
        int expResult = 40;
        int result = instance.getCarbs();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFat method, of class Food.
     */
    @Test
    public void testGetFat() {
        System.out.println("getFat");
        Food instance = new Food(75, 4, 7, 4);
        int expResult = 4;
        int result = instance.getFat();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCalories method, of class Food.
     */
    @Test
    public void testSetCalories() {
        System.out.println("setCalories");
        int calories = 215;
        Food instance = new Food(210);
        instance.setCalories(calories);
        assertEquals(calories, instance.getCalories());
    }

    /**
     * Test of setProtein method, of class Food.
     */
    @Test
    public void testSetProtein() {
        System.out.println("setProtein");
        int protein = 4;
        Food instance = new Food(170);
        instance.setProtein(protein);
        assertEquals(protein, instance.getProtein());
    }

    /**
     * Test of setCarbs method, of class Food.
     */
    @Test
    public void testSetCarbs() {
        System.out.println("setCarbs");
        int carbs = 0;
        Food instance = null;
        instance.setCarbs(carbs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFat method, of class Food.
     */
    @Test
    public void testSetFat() {
        System.out.println("setFat");
        int fat = 0;
        Food instance = null;
        instance.setFat(fat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

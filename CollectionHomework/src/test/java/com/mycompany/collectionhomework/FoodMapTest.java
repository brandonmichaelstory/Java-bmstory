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
public class FoodMapTest {
    
    public FoodMapTest() {
    }
    
    /**
     * Test of readInputFile method, of class FoodMap.
     */
    @Test
    public void testReadInputFile() throws Exception {
        /*System.out.println("readInputFile");
        FoodMap instance = new FoodMap();
        instance.readInputFile();*/
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nutritionToString method, of class FoodMap.
     */
    @Test
    public void testNutritionToString() {
        /*System.out.println("nutritionToString");
        Food f = null;
        FoodMap instance = new FoodMap();
        String expResult = "";
        String result = instance.nutritionToString(f);
        assertEquals(expResult, result);*/
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recieveInput method, of class FoodMap.
     */
    @Test
    public void testRecieveInput() throws Exception {
        /*System.out.println("recieveInput");
        FoodMap instance = new FoodMap();
        boolean expResult = false;
        boolean result = instance.recieveInput();
        assertEquals(expResult, result);
        */
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanInput method, of class FoodMap.
     */
    @Test
    public void testCleanInput() {
        System.out.println("cleanInput");
        String answer = "    HeLlo ";
        String answer2 = "BYe     ";
        String expected = "hello";
        String expected2 = "bye";
        String result = "", result2 = "";
        FoodMap instance = new FoodMap();
        result = instance.cleanInput(answer);
        result2 = instance.cleanInput(answer2);
        
        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }

    /**
     * Test of addFood method, of class FoodMap.
     */
    @Test
    public void testAddFood() {
        /*System.out.println("addFood");
        FoodMap instance = new FoodMap();
        instance.addFood();*/
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editFood method, of class FoodMap.
     */
    @Test
    public void testEditFood() {
        /*System.out.println("editFood");
        FoodMap instance = new FoodMap();
        instance.editFood();*/
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayFood method, of class FoodMap.
     */
    @Test
    public void testDisplayFood() {
        /*System.out.println("displayFood");
        Food f = null;
        FoodMap instance = new FoodMap();
        instance.displayFood(f);*/
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewFood method, of class FoodMap.
     */
    @Test
    public void testViewFood() {
        /*System.out.println("viewFood");
        FoodMap instance = new FoodMap();
        instance.viewFood();*/
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

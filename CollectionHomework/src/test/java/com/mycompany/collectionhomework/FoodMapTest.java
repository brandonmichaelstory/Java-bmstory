/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionhomework;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
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
        System.out.println("nutritionToString");
        FoodMap instance = new FoodMap();
        String in = "hamburger" + System.lineSeparator() + "210 19 17 15" + System.lineSeparator();
        instance.forConsole = new Scanner(in);
        instance.addFood();
        String expectedResult = "210 19 17 15 ";
        assertEquals(expectedResult, instance.nutritionToString(instance.foods.get("hamburger")));
    }

    /**
     * Test of recieveInput method, of class FoodMap.
     */
    @Test
    public void testRecieveInput() throws Exception {
        System.out.println("recieveInput");
        FoodMap instance = new FoodMap();
        boolean expectedResult = true;
        boolean result = false;
        try {
            String in = "add" + System.lineSeparator() + "hamburger" + System.lineSeparator() + "210 19 17 15" + System.lineSeparator();
            instance.forConsole = new Scanner(in);
            result = instance.recieveInput();
            
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
        
        assertEquals(expectedResult, result);
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
        System.out.println("addFood");
        Food f1 = new Food(210, 19, 17, 15);
        FoodMap instance = new FoodMap();
        String in = "hamburger" + System.lineSeparator() + "210 19 17 15" + System.lineSeparator();
        instance.forConsole = new Scanner(in);
        instance.addFood();
        Food f2 = instance.foods.get("hamburger");
        assertEquals(true, instance.foods.containsKey("hamburger"));
        assertEquals(f1.getCalories(), f2.getCalories());
        assertEquals(f1.getProtein(), f2.getProtein());
        assertEquals(f1.getCarbs(), f2.getCarbs());
        assertEquals(f1.getFat(), f2.getFat());
    }

    /**
     * Test of editFood method, of class FoodMap.
     */
    @Test
    public void testEditFood() {
        System.out.println("editFood");
        FoodMap instance = new FoodMap();
        String in = "hamburger" + System.lineSeparator() + "210 19 17 15" + System.lineSeparator();
        instance.forConsole = new Scanner(in);
        instance.addFood();
        assertEquals(17, instance.foods.get("hamburger").getCarbs());
        in = "hamburger" + System.lineSeparator() + "carbs" + System.lineSeparator() +  "0" + System.lineSeparator();
        instance.forConsole = new Scanner(in);
        instance.editFood();
        assertEquals(0, instance.foods.get("hamburger").getCarbs());
    }

    /**
     * Test of displayFood method, of class FoodMap.
     */
    @Test
    public void testDisplayFood() {
       System.out.println("displayFood");
       FoodMap instance = new FoodMap();
       String in = "hamburger" + System.lineSeparator() + "210 19 17 15" + System.lineSeparator();
       instance.forConsole = new Scanner(in);
       instance.addFood();
       ByteArrayOutputStream output = new ByteArrayOutputStream();
       System.setOut(new PrintStream(output));
       instance.displayFood(new Food(210, 19, 17, 15));
       String expectedResult = "Calories: " + "210" + " Protein: " + "19" + " Carbs: " + "17" + " Fat: " + "15" + System.lineSeparator();
       assertEquals(expectedResult, output.toString());
    }

    /**
     * Test of viewFood method, of class FoodMap.
     */
    @Test
    public void testViewFood() {
        System.out.println("viewFood");
        FoodMap instance = new FoodMap();
        String in = "hamburger" + System.lineSeparator() + "210 19 17 15" + System.lineSeparator();
        instance.forConsole = new Scanner(in);
        instance.addFood();
        in = "hamburger" + System.lineSeparator();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        instance.forConsole = new Scanner(in);
        instance.viewFood();
        String expected = "<viewFood>" + System.lineSeparator() + "What food would you like to see nutritional information about?"
            + System.lineSeparator() + "Calories: " + "210"+ " Protein: " + "19" + " Carbs: " + "17" + " Fat: " + "15" + System.lineSeparator();
        assertEquals(expected, output.toString());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionhomework;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author micha
 */

class Food {
    
    int calories, protein, carbs, fat;
    public Food(int calories, int protein, int carbs, int fat) {
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }
    public Food(int calories) {
        this.calories = calories;
    }
    public int getCalories() { return this.calories; }
    public int getProtein() { return this.protein; }
    public int getCarbs() { return this.carbs; }
    public int getFat() { return this.fat; }
    public void setCalories(int calories) { this.calories = calories; }
    public void setProtein(int protein) { this.protein = protein; }
    public void setCarbs(int carbs) { this.carbs = carbs; }
    public void setFat(int fat) { this.fat = fat; } 
}

public class FoodMap {
    
    Scanner forConsole = new Scanner(System.in);
    HashMap<String, Food> foods = new HashMap<>();
    public static void main(String[] args) {
        FoodMap fm = new FoodMap();
        fm.recieveInput();
    }
    public boolean recieveInput()  {
        
        boolean continueInput = true;
        String answer;
        answer = forConsole.nextLine();
        answer = cleanInput(answer);
        System.out.println("What would you like to do?");
        System.out.println("Add a new food");
        System.out.println("Edit an old food");
        System.out.println("View the info about a food");
        System.out.println("exit");
        if (answer.equals("add")) {
            addFood();
        }
        else if (answer.equals("edit")) {
            editFood();
        }
        else if (answer.equals("view")) {
            viewFood();
        }
        else if (answer.equals("exit")) {
            continueInput = false;
        }
        return continueInput;
    }
    
     public String cleanInput(String answer) {
        
        answer = answer.toLowerCase();
        answer = answer.stripLeading();
        answer = answer.stripTrailing();
        return answer;
    }
     
    public void addFood() {
        System.out.println("<addFood>");
        String name;
        int calories, protein, carbs, fat;
        System.out.println("Enter the name of the food, calories, protein, carbs, fat.");
        name = forConsole.nextLine();
        name = cleanInput(name);
        if (!foods.containsKey(name)) {
            calories = forConsole.nextInt();
            protein = forConsole.nextInt();
            carbs = forConsole.nextInt();
            fat = forConsole.nextInt();
            forConsole.nextLine();
            Food f = new Food(calories, protein, carbs, fat);
            this.foods.put(name, f);
        }
        
    }
}

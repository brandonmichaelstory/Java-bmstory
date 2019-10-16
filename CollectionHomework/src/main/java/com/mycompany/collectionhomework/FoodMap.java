/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionhomework;
import java.io.FileReader;
import java.io.FileWriter;
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
    FileWriter fw;
    FileReader fr;
    Scanner forFile;
    HashMap<String, Food> foods = new HashMap<>();
    public static void main(String[] args) {
        FoodMap fm = new FoodMap();
        boolean keepRunning = true;
        while (keepRunning) {
            try {
            keepRunning = fm.recieveInput();
            }
            catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public FoodMap() {
        try {
            readInputFile();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public void readInputFile() throws Exception {
        fr = new FileReader("C:\\Users\\micha\\Desktop\\output.txt");
        forFile = new Scanner(fr);
        forConsole = new Scanner(System.in);
        int i = 0;
        String food = "";
        while(forFile.hasNextLine()) {
            if (i %2 == 0) {
                food = forFile.nextLine();
                food = cleanInput(food);
            }
            else {
                Food temp = new Food(1);
                String info = forFile.nextLine();
                info = cleanInput(info);
                String[] numbers = info.split(" ");
                temp.setCalories(Integer.parseInt(numbers[0]));
                temp.setProtein(Integer.parseInt(numbers[1]));
                temp.setCarbs(Integer.parseInt(numbers[2]));
                temp.setFat(Integer.parseInt(numbers[3]));
                foods.put(food, temp);
            }
            i += 1;
        }
        fr.close();
    }
    
    public String nutritionToString(Food f) {
        
        String s = "";
        s = s.concat(Integer.toString(f.getCalories()) + " ");
        s = s.concat(Integer.toString(f.getProtein()) + " ");
        s = s.concat(Integer.toString(f.getCarbs()) + " ");
        s = s.concat(Integer.toString(f.getFat()) + " ");
        return s;
    }
    
    public boolean recieveInput() throws Exception {
        
        boolean continueInput = true;
        String answer;
        System.out.println("What would you like to do?");
        System.out.println("Add a new food");
        System.out.println("Edit an old food");
        System.out.println("View the info about a food");
        System.out.println("exit");
        answer = forConsole.nextLine();
        answer = cleanInput(answer);
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
            try {
            fw = new FileWriter("C:\\Users\\micha\\Desktop\\output.txt");
            }
            catch (Exception e) {
                System.out.println(e.toString());
            }
            foods.forEach((key, value) -> { 
                    try {
                        fw.write(key + System.lineSeparator() + nutritionToString(value) + System.lineSeparator());
                        fw.flush();
                        
                    }
                    catch (Exception e) {
                        System.out.println("An error occurred when writing to file");
                        System.out.println(e.toString());
                    }
                    finally {
                        try {
                            fw.flush();
                          
                        }
                        catch (Exception e) {
                            System.out.println(e.toString());
                        }
                    }
                }
            );
            fw.close();
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
    
    public void editFood() {
        System.out.println("<editFood>");
        String answer;
        System.out.println("What food would you like to edit?");
        answer = forConsole.nextLine();
        answer = cleanInput(answer);
        if (foods.containsKey(answer)) {
            Food f = foods.get(answer);
            displayFood(f);
            System.out.println("What would you like to edit? (calories, protein, carbs, fat)");
            answer = forConsole.nextLine();
            answer = answer.toLowerCase();
            if (answer.equals("calories")) {
                System.out.println("Enter the new calories");
                int c = forConsole.nextInt();
                f.calories = c;
            
            }
            else if (answer.equals("protein")) {
                System.out.println("Enter the new protein.");
                int p = forConsole.nextInt();
                f.protein = p;
            }
            else if (answer.equals("carb")) {
                System.out.println("Enter the new carb.");
                int c = forConsole.nextInt();
                f.carbs = c;
            }
            else if (answer.equals("fat")) {
                System.out.println("Enter the new fat.");
                int fat = forConsole.nextInt();
                f.fat = fat;  
            }
            forConsole.nextLine();
        }
        else {
            System.out.println("That food is not currently entered. Make sure you've used the correct spelling or add it to the program.");
        }
    }
    
    public void displayFood(Food f) {
        
        System.out.println("Calories: " + f.calories + " Protein: " + f.protein + " Carbs: " + f.carbs + " Fat: " + f.fat);
    }
    
    public void viewFood() {
        System.out.println("<viewFood>");
        System.out.println("What food would you like  to see nutritional information about?");
        String foodname;
        foodname = forConsole.nextLine();
        foodname = cleanInput(foodname);
        if (this.foods.containsKey(foodname)) {
            Food temp = this.foods.get(foodname);
            displayFood(temp);
        }
        else {
            System.out.println("That food curretly is not enter. Make sure you've spelled it correctly or add it to the program.");
        }
    }
}

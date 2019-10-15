/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionhomework;

/**
 *
 * @author micha
 */
public class FoodMap {
    
    
    public static void main(String[] args) {
        FoodMap fm = new FoodMap();
        fm.recieveInput();
    }
    public boolean recieveInput()  {
        
        boolean continueInput = true;
        String answer;
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
}

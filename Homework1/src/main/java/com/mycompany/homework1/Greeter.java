/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework1;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author micha
 */
public class Greeter {
    
    // public for testing
    public ArrayList<String> Greetings = new ArrayList<String>();
    private String currentGreeting = "Hello World";
    private String defaultGreeting = "Hello World!";
    
    public Greeter() {
        
        this.Greetings.add("Hola!");
        this.Greetings.add("Whats Up!");
        this.Greetings.add("Hi!");
    }
    public String getCurrentGreeting() {
        
        if (currentGreeting == null) {
            return defaultGreeting;
        }
        else {
            return currentGreeting;
        }
    }
    
    public void setCurrentGreeting(String greeting) {
        
        if (!this.Greetings.contains(greeting)) {
            this.Greetings.add(greeting);
        }
        this.currentGreeting = greeting;
    }
    
    public String getRandomGreeting() {
      
        Random r = new Random();
        return this.Greetings.get(r.nextInt(this.Greetings.size()));
    }
   
    
}

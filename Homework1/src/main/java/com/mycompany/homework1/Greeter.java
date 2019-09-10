/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework1;

/**
 *
 * @author micha
 */
public class Greeter {
    
    private String currentGreeting = null;
    private String defaultGreeting = "Hello World!";
    
    public String getGreeting() {
        
        if (currentGreeting == null) {
            return defaultGreeting;
        }
        else {
            return currentGreeting;
        }
    }
}

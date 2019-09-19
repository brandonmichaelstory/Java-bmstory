/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tolowerkattisproblem;
import java.util.Scanner;
/**
 *
 * @author micha
 */
public class App {
    
    
    public static void main(String[] args) {
        
    }
    
    public boolean fixable(String text) {
        boolean canFix = false;
        int upperCase = 0;
        for (int i = 0; i < text.length(); i++) {
            
            if (text.charAt(i) > 'A' && text.charAt(i) < 'Z') {
                upperCase++;
            }
        }
        if (upperCase < 2) {
            canFix = true;
        }
        return canFix;
    }
    
    public int run() {
      
        Scanner s = new Scanner(System.in);
        int solved = 0;
        int P, T, PT;
        P = s.nextInt();
        T = s.nextInt();
        PT = P * T;
        
        
        return solved;
    }
}

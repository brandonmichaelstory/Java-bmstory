/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tolowerkattisproblem;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author micha
 */
public class App {
    
    
    public static void main(String[] args) {
        
        App app = new App();
        System.out.println(app.run());
    }
    
    public boolean fixable(String text) {
        boolean canFix = false;
        int upperCase = 0;
        for (int i = 1; i < text.length(); i++) {
            
            if (text.charAt(i) > 'A' && text.charAt(i) < 'Z') {
                upperCase++;
            }
        }
        if (upperCase == 0) {
            canFix = true;
        }
        return canFix;
    }
    
    public boolean testProblemSet(int T, ArrayList<String> lines) {
        
        int fixableCount = 0;
        for (int i = 0; i < lines.size(); i++) {
            
            if (fixable(lines.get(i))) {
                fixableCount++;
            }
        }
        if (fixableCount == T) {
            return true;
        }
        
        return false;
    }
    public int run() {
      
        ArrayList<String> lines = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        int solved = 0;
        int P, T, PT;
        P = s.nextInt();
        T = s.nextInt();
        s.nextLine();
        PT = P * T;
        
        int counter = 0;
        while(counter < PT) {
            
            for (int i = 0; i < T; i++) {
                lines.add(s.nextLine());
                counter++;
            }
            if (testProblemSet(T, lines) == true) {
                solved++;
            }
        }
        return solved;
    }
}

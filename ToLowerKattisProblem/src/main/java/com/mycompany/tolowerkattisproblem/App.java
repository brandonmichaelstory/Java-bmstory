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
    
    int P, T, PT;
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        App app = new App();
        System.out.println(app.run());
    }
    
    public void ReadData() {
        P = in.nextInt();
        T = in.nextInt();
        PT = P *T;
        in.nextLine();
    }
    public boolean fixable(String text) {
        boolean canFix = true;
        for (int i = 1; i < text.length(); i++) {
            
            if (text.charAt(i) < 'a' || text.charAt(i) > 'z') {
                canFix = false;
            }
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
      
        ReadData();
        ArrayList<String> lines = new ArrayList<String>();
        int solved = 0;
        int counter = 0;
        while(counter < PT) {
            
            for (int i = 0; i < T; i++) {
                lines.add(in.nextLine());
                counter++;
            }
            if (testProblemSet(T, lines) == true) {
                solved++;
            }
            lines.clear();
        }
        return solved;
    }
}

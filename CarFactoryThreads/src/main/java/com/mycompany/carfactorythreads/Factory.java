/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carfactorythreads;
import java.util.ArrayList;
/**
 *
 * @author micha
 */

enum PaintColor {
    RED, BLACK, WHITE
}

enum InteriorMaterial {
    LEATHER, SUEDE, VINYL
}

class Car {

   PaintColor paintcolor;
   InteriorMaterial interior;
   
   Car(PaintColor paintcolor, InteriorMaterial interior) {
       this.interior = interior;
       this.paintcolor = paintcolor;
   }
}
class AssemblyLine {


	Factory factory;
	PaintColor availablePaintColor;
	InteriorMaterial availableInterior;
	AssemblyLine(Factory factory, PaintColor availablePaintColor, InteriorMaterial availableInterior) {

		this.factory = factory;
		this.availablePaintColor = availablePaintColor;
		this.availableInterior = availableInterior;

	}

	public void buildCar() {


	}

}
public class Factory {
    
    int finishedCars = 0;
    
    public static void main(String[] args) {
        
    }
    
    public PaintColor getColor(int number) {

        PaintColor pc = null;
	switch(number) {
            
            case 0:
		pc = PaintColor.RED;
            case 1:
		pc = PaintColor.BLACK;
            case 2:
		pc = PaintColor.WHITE;

		}
        return pc;
    }
    
    public InteriorMaterial getMaterial(int number) {

        InteriorMaterial im = null;
        switch(number) {

            case 0:
		im = InteriorMaterial.LEATHER;
            case 1:
		im = InteriorMaterial.SUEDE;
            case 2:
		im = InteriorMaterial.VINYL;

	}
        return im;
    }
}

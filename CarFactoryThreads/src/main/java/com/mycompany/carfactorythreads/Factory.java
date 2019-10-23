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

        Car c = new Car(availablePaintColor, availableInterior);
        this.factory.updateInventory(c);
        this.factory.updateFinishedCars();  
    }

}
public class Factory {
    
    int finishedCars = 0;
    ArrayList<Car> inventory = new ArrayList<Car>(50);
    ArrayList<AssemblyLine> assemblylines = new ArrayList<AssemblyLine>();
    private Object finishedCarsLock = new Object();
    private Object inventoryLock = new Object();
    public static void main(String[] args) {
        
    }
    public void updateFinishedCars() {

	synchronized (finishedCarsLock) {
            finishedCars++;
	}
    }
	
    public void updateInventory(Car c) {

        synchronized (inventoryLock) {
            inventory.add(c);
	}
    }
    
    public void production() {
		
	for (int i = 0; i < 3; i++) {
			
            for (int j = 0; j < 3; j++) {
		assemblylines.add(new AssemblyLine(this, getColor(i), getMaterial(j)));
            }
	}
	assemblylines.parallelStream().forEach(line ->line.buildCar());
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

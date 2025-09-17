package com.tnsif.inheritance;

public class Vehicle {
	 String brand;
	 int wheels;

	 Vehicle(String brand, int wheels) {
	     this.brand = brand;
	     this.wheels = wheels;
	 }

	 void displayInfo() {
	     System.out.println("Brand: " + brand);
	     System.out.println("Number of wheels: " + wheels);
	 }
	}

	//Child class 1
	class Car extends Vehicle {
	 int doors;

	 Car(String brand, int wheels, int doors) {
	     super(brand, wheels); // calling parent constructor
	     this.doors = doors;
	 }

	 void carDetails() {
	     displayInfo(); // parent method
	     System.out.println("Number of doors: " + doors);
	 }
	}

	//Child class 2
	class Bike extends Vehicle {
	 boolean hasGear;

	 Bike(String brand, int wheels, boolean hasGear) {
	     super(brand, wheels);
	     this.hasGear = hasGear;
	 }

	 void bikeDetails() {
	     displayInfo();
	     System.out.println("Has gear: " + (hasGear ? "Yes" : "No"));
	 }

}

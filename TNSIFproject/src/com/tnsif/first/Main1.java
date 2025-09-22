package com.tnsif.first;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car1 = new Car("Tesla", "Model S");

	        // Access data safely using getters/setters
	        car1.displayCar();  // default speed = 0

	        car1.setSpeed(120); // valid speed
	        car1.displayCar();

	        car1.setSpeed(250); // invalid speed
	        car1.displayCar();

	}

}

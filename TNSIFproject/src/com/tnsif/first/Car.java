package com.tnsif.first;

public class Car {
	    private String brand;
	    private String model;
	    private int speed;

	    // Constructor
	    public Car(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	        this.speed = 0; // default speed
	    }

	    // Getter for brand
	    public String getBrand() {
	        return brand;
	    }

	    // Getter for model
	    public String getModel() {
	        return model;
	    }

	    // Getter for speed
	    public int getSpeed() {
	        return speed;
	    }

	    // Setter for speed (with validation)
	    public void setSpeed(int speed) {
	        if (speed >= 0 && speed <= 200) {
	            this.speed = speed;
	        } else {
	            System.out.println("Invalid speed! Speed must be between 0 and 200.");
	        }
	    }

	    // Method to display car details
	    public void displayCar() {
	        System.out.println("Car: " + brand + " " + model + ", Speed: " + speed + " km/h");
	    }

}

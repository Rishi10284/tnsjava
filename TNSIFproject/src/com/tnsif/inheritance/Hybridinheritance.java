package com.tnsif.inheritance;

public class Hybridinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dog");
        Dog d = new Dog();
        d.eat();   // from Animal
        d.walk();  // from Mammal
        d.bark();  // from Dog

        // Hierarchical inheritance demo
        System.out.println("\nBird");
        Bird b = new Bird();
        b.eat();   // from Animal
        b.fly();   // from Bird
    }

}



package com.tnsif.inheritance;

public class Animal {
	void eat() {
        System.out.println("Animals eat food.");
    }
}

// First level derived class (Hierarchical)
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals walk on land.");
    }
}

// Second level derived class (Multilevel from Animal → Mammal → Dog)
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Another first level derived class (Hierarchical: Animal → Bird)
class Bird extends Animal {
    void fly() {
        System.out.println("Birds can fly.");
    }

}

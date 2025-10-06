package com.tnsif.exceptionhandling;

public class Throwdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 4;
		if(age < 18)
			throw new ArithmeticException("Not Elgible");
		else
			System.out.println("Elgible");

	}

}

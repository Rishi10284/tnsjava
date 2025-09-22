package com.tnsif.first;

public class elseIfexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 75;

        if (marks <= 90 && marks >= 74) {
            System.out.println("Grade: A");
        } else if (marks <= 75 && marks >= 65) {
            System.out.println("Grade: B");
        } else if (marks <= 64 && marks >= 50) {
            System.out.println("Grade: C");
        } else if (marks <= 49){
            System.out.println("Grade: Fail");
        } else  {
        	System.out.println("Invalid Marks!");
        
        }
	}

}

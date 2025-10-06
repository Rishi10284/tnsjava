package com.tnsif.exceptionhandling;

public class Trycatch1 {
	public static void main(String [] args) {
	try {
		String s = null;
		System.out.println(s.length());
	    } 
	catch(Exception e) {
		System.out.println("Nulls are not allowed");
	}finally {
		System.out.println("This block is always executed irrespective of try and catch blocks");
	}

}
}

package com.tnsif.arraysstrings;

public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello");
		System.out.println(s); //Hello
		
		String s1 = s.toUpperCase();
		System.out.println(s1);  //HELLO
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s); 
		
		System.out.println(s.length());
		
		String s2 = "  Hii  ";
		System.out.println(s2);
		System.out.println(s2.trim());
		
		System.out.println(s1.concat(s2.trim())); 
		
		

	}

}

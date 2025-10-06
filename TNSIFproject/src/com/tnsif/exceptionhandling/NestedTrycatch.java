package com.tnsif.exceptionhandling;

public class NestedTrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				String s = null;
				System.out.println(s.length());
			}catch(Exception e) {
				System.out.println("Nulls are not allowed");
			}finally {
				System.out.println("Inner finally");
			}
		}catch(Exception e) {
			System.out.println("Outer Catch block");
		}finally {
			System.out.println("Outer final block");
		}

	}

}

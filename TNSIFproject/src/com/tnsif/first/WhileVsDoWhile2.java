package com.tnsif.first;

public class WhileVsDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;

        System.out.println("Using while loop:");
        while (n > 0) {
            System.out.println("n = " + n);
            n--;
        }

        n = 3; // reset

        System.out.println("Using do-while loop:");
        do {
            System.out.println("n = " + n);
            n--;
        } while (n > 0);

	}

}

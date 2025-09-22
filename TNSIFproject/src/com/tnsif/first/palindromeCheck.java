package com.tnsif.first;
import java.util.Scanner;

public class palindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();  // take input as string

        // Reverse the input
        String reversed = new StringBuilder(input).reverse().toString();

        // Compare ignoring case (for strings)
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close();

	}

}

package com.tnsif.first;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 148;
        int original = num;
        int remainder;
        int result = 0;

        int n = String.valueOf(num).length();  // safe for negative numbers

        while (original != 0) {
            remainder = original % 10;
            result += (int) Math.pow(remainder, n); // explicit cast
            original /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

	}

}

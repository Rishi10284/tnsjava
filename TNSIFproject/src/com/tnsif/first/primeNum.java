package com.tnsif.first;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
        boolean isPrime;

        System.out.println("Prime numbers between 1 and 100 are:");

        for (i = 2; i <= 100; i++) {   // start from 2 (smallest prime)
            isPrime = true;

            // check divisibility
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;   // not prime
                    break;
                }
            }

            if (isPrime)
                System.out.print(i + " ");
        }

	}

}

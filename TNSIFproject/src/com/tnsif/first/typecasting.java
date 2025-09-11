package com.tnsif.first;

public class typecasting {

	public static void main(String[] args) {
		
		int X = 10;
        double Y = X;
        System.out.println("Implicit Casting:");
        System.out.println("Integer: " + X);
        System.out.println("Double: " + Y);

        
        double R = 9.78;
        int r = (int) R;
        System.out.println("Explicit Casting:");
        System.out.println("Double: " + R);
        System.out.println("Integer: " + r);

	}

}

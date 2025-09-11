package com.tnsif.first;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b)); 

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + ((a>=9) && (b<10)));
        System.out.println("z || y: " + ((a<10)|| (b<10)));
        System.out.println("!x: " + (!(a>=9)));

        // Bitwise Operators
        int p = 6, q = 3; // binary: 6=110, 3=011
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q = " + (p & q)); // AND
        System.out.println("p | q = " + (p | q)); // OR
        System.out.println("p ^ q = " + (p ^ q)); // XOR
        System.out.println("~p = " + (~p));       // NOT
        System.out.println("p << 1 = " + (p << 1)); // Left shift
        System.out.println("p >> 1 = " + (p >> 1)); // Right shift

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        a += 5;  // a = a + 5
        System.out.println("a += 5: " + a);
        a -= 3;  // a = a - 3
        System.out.println("a -= 3: " + a);
        a *= 2;  // a = a * 2
        System.out.println("a *= 2: " + a);
        a /= 4;  // a = a / 4
        System.out.println("a /= 4: " + a);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("b = " + b);
        System.out.println("++b = " + (++b)); // pre-increment
        System.out.println("b++ = " + (b++)); // post-increment
        System.out.println("b = " + b);
        System.out.println("--b = " + (--b)); // pre-decrement
        System.out.println("b-- = " + (b--)); // post-decrement
        System.out.println("b = " + b);

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b is: " + max);

	}

}

/*
 	CONTROLLER
 	LOGIC i.e. ALGO
 	1. Operators
 	2. Conditional Flows
 	3. Iterations  
 */
public class Operators {

	public static void main(String[] args) {
		
		int productPrice = 2500;
		
		// Relational Operators and Logical Operators
		// Relational: >, <, >=, <=, ==, !=
		// Logical: &&, ||, |
		// 500 to 1000 -> 30%OFF
		// 1000 to 2000 -> 50%OFF
		// above 2000 -> 60%OFF
		// below 500 -> nothing
		
		System.out.println("Will we get some discounts: "+(productPrice>=500));
		System.out.println("Can we get 30% Off: "+(productPrice>=500 && productPrice<1000));
		System.out.println("Can we get 50% Off: "+(productPrice>=1000 && productPrice<2000));
		System.out.println("Can we get 60% Off: "+(productPrice>=2000));
		
		String willWeGetDiscount = ((productPrice>=2000)) ? "Yes" : "No";
		System.out.println("Will we get Flat 50% OFF: "+willWeGetDiscount);
		
		// for payments above 2000 if user is using paytm user will get 10% CashBack 
		boolean isPayTmUsed = false;
		System.out.println("Can we get 60% Off: "+(productPrice>=2000) + " CashBack of 10% will be Rewarded "+(productPrice>=2000 && isPayTmUsed));
		
		// Ternary Operator
		double cashBack = (productPrice>=2000 && isPayTmUsed) ? (0.10 * productPrice) : 0;
		
		String message = (cashBack != 0) ? "CashBack Earned: "+cashBack : "No CashBack Earned";
		System.out.println(message);
		
		// Shift operators : Used in Security and Gaming majorly
		int x = 8;
		int y = x >> 2; // 8 / 2power2
		int z = x << 3; // 8 * 2power3
		System.out.println("y is: "+y);
		System.out.println("z is: "+z);
		
		// BitWise Operators -> They do operations on Bits
		// Number System in CS: binary, octal, decimal, hexadecimal | Please Explore if you are not known to it :)
		// 						   8 4 2 1
		int num1 = 10;			// 1 0 1 0
		int num2 = 12;			// 1 1 0 0

		int num3 = num1 & num2; // 1 0 0 0 both should be 1 we will get 1 else 0
		int num4 = num1 | num2; // 1 1 1 0 any one should be 1 we will get 1 else 0
		int num5 = num1 ^ num2; // 0 1 1 0 one should be 1 and other 0 we will get 1 else 0
		
		System.out.println(num3); // 8
		System.out.println(num4); // 14
		System.out.println(num5); // 6
		
		// Assignment Operators
		// =, +=, -=, *=, /=, %=,  >>= .....
		
		//productPrice = productPrice + (int)(0.18*productPrice);	// expression1
		productPrice += (int)(0.18*productPrice);					// expression2 which is shorthand representation of expression1 with assignment operator
		
		System.out.println("productPrice now is: "+productPrice);
		
	}

}

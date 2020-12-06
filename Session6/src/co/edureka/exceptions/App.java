package co.edureka.exceptions;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		//					0    1   2  3   4   5   6   7    8   9
		int[] cashBacks = {100, 50, 20, 80, 60, 10, 30, 90, 70, 200};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is Your Lucky Number?");
		int luckyNumber = scanner.nextInt();
		scanner.close();
		
		int cashBack = 0;
		int additionalCashBack = 0;
		// try is a block, in which we put statements, which can raise errors at runtime
		try {
			cashBack = cashBacks[luckyNumber];
			additionalCashBack = cashBack/luckyNumber;
		}/*catch(ArrayIndexOutOfBoundsException aRef) { // catch catches the errors by JVM and resumes the program flow
			System.out.println("OOPS!! Seems like we dont have CashBack for You :(");
			//System.out.println("Exception is: "+aRef);
			//aRef.printStackTrace(); // prints the entire trace with line numbers
		}catch(ArithmeticException ae) {
			System.out.println("Sorry !! You are not so lucky to have additional cashback :(");
		}*/
		catch(Exception e) { // Exception is Parent to All the Exceptions in Java, and Hence with RTP, Parent can refere to any child
			System.out.println("Exception: "+e);
		}
		finally { // this will always be executed :)
			System.out.println("This is finally");
		}
		
		System.out.println("You won a CashBack of \u20b9"+cashBack);
		System.out.println("Additional CashBack Won: \u20b9"+additionalCashBack);
		
		/*if(luckyNumber % 2 !=0 ) {
			System.out.println("Additional CashBack Won: \u20b9"+(3*cashBack));
		}else {
			System.out.println("Additional CashBack Won: \u20b9"+(2*cashBack));
		}*/
		
		System.out.println("Main Finished");

	}

}

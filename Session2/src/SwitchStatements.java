// Scanner is a utility class in Java to read from Console
// i.e. to take input from user into the program :)
import java.util.Scanner;


public class SwitchStatements {

	public static void main(String[] args) {
		
		// Types of Cab:
		int uberGo = 1;
		int moto = 2;
		int premier = 3;
	
		// User Selection
		//int userChoice = moto;
		
		System.out.println("1. UberGo");
		System.out.println("2. Moto");
		System.out.println("3. Premier");
		System.out.println("Select the Cab: ");
		
		// Object Construction Statement
		// Scanner is class and scanner is referring to object of Scanner to read from Console :)
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt(); // nextInt to read int, nextDouble for double so on and so forth...
		
		// Ladder if/else
		/*
		if(userChoice == uberGo) {
			
		}else if(userChoice == moto) {
			
		}else if(userChoice == premier) {
			
		}else {
			
		}*/
		
		// switch statements
		switch (userChoice) {
			case 1:
				System.out.println("You have Selected UberGo");
				System.out.println("Please Pay \u20b9 50");
				break; // from the switch we get out of it with break :)
	
			case 2:
				System.out.println("You have Selected Moto");
				System.out.println("Please Pay \u20b9 15");
				break;
				
			case 3:
				System.out.println("You have Selected Premier");
				System.out.println("Please Pay \u20b9 100");
				break;
				
			default:
				System.out.println("Please Select the Available Cab First");
				break;
		}

	}

}

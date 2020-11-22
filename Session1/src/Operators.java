
public class Operators {

	public static void main(String[] args) {
		
		int dishQuantity = 0;
		dishQuantity++;	// increments by 1 postfix
		dishQuantity++;	// increments by 1 postfix
		++dishQuantity;	// increments by 1 prefix
		
		--dishQuantity; // decrement by 1 prefix
		
		System.out.println("Dish Quantity is: "+dishQuantity); // 2
		
		// Assignment: Explore the difference in usage of ++ and -- in prefox and postfix
		
		int dish1 = 200;
		int quantity1 = 1;
		
		int dish2 = 150;
		int quantity2 = 4;
		
		int dish3 = 375;
		int quantity3 = 2;

		int total = dish1*quantity1 + dish2*quantity2 + dish3*quantity3;
		System.out.println("Please Pay a Total of \u20b9"+total);
		
		System.out.println("Am i Elgible for Discounts: "+(total > 1000));
		
		// Assignment: Explore all the below operators :)
		// ++, --
		// _, -, *, /, %
		// >, <, >=, <=, ==, !=
		

	}

}

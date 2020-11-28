
public class Methods {
	
	// what is a method ?
	// non static -> with no static keyword		| method of object of class
	// static -> with static keyword			| method of class itself 
	
	// OOPS :)
	// static vs non static in detail -> upcoming session
	
	// void -> return type i.e. return nothing
	// addNumbers -> name of the method
	// int a, int b -> input list of the method
	// { } -> body of the method
	void addNumbers(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of "+a+" and "+b+" is: "+sum);
	}
	
	// static method
	// int -> return type i.e. return integer
	static int area(int length, int breadth) {
		int result = length * breadth;
		return result; // my last statement is returning an integer result :)
	}

	public static void main(String[] args) { // main is a method
	
		// Execution of main happens automatically when we execute the program
		// So other methods we are going to execute from here
		
		// execute non static methods i.e. method of object of class
		// create the object of class first
		Methods ref = new Methods();	// what is an object -> in our next session :)
		ref.addNumbers(10, 20);
		ref.addNumbers(30, 40);
		
		// with the object of class we can also execute static method but not recommended
		int returnedValue = ref.area(4, 5);
		System.out.println("returned area is: "+returnedValue);
		
		// execute the static method can be done directly with the class name
		returnedValue = Methods.area(10, 10);
		System.out.println("returned area again is: "+returnedValue);

	}

}

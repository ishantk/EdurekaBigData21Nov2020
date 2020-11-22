// public class MyApplication : Java Program
// Any java program will have class :)

public class MyApplication {
	
	// we will discuss static and instance variables later :)
	static int users; // static variable
	int userId;		  // instance variable

	// main -> is the one which is executed when we execute program :)
	// it means, whatever we code in main will be executed
	// whatever we write in main is executed and that too sequentially :)
	// String[] args -> Command Line Arguments | Array of Strings given to the main function during execution
	public static void main(String[] args) {
		
		// local variable
		int dishCount=0;
		
		System.out.println("Hello Everyone");
		System.out.println("Everything gets executed in a sequence");
		System.out.println("I hope your understoord. :) as ack");

		System.out.println(dishCount);
	}

}

class One{
	
}

class Two{
	
}

// PS: If we create n-number of classes, we will get n-number of byte codes in bin directory :)
//     ByteCode is not associated to the program i.e. .java, it is associated to the classes we create in our program
package co.edureka.wrapper;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// Primitive Type
		// it can just help us to hold some data
		int i = 10;
		
		// Wrapper or Reference Type for int
		// Wrapper Classes comes with more power
		// i.e. we have some utility functions to process the data within the object :)
		//Integer iRef = new Integer(10);	// BOXING
		Integer iRef = 10;					// AUTO BOXING
		
		// UN-BOXING
		System.out.println(iRef.intValue());
		
		// AUTO UN-BOXING
		System.out.println(iRef);
		
		String data = "100";
		int j = Integer.parseInt(data);
		
		// Data Structure in Java is under Collection Framework
		// They only work with Objects and hence if we wish to store primitives we need to use Wrapper Classes
	}

}

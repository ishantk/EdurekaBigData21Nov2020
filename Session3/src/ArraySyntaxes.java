
public class ArraySyntaxes {
	
	static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {

		// Implicit Syntax : we are not putting new operator ourselves, compiler will do it on our behalf
		// Syntax #1
		int[] array1 = {10, 20, 30, 40, 50};	// bracket before
		
		// Syntax #2
		int array2[] = {10, 20, 30, 40, 50};	// bracket after
		
		
		// Explicit Syntax : we are putting the new operator ourselves
		// Syntax #3
		int[] array3 = new int[]{10, 20, 30, 40, 50};	// bracket before with new int
		
		// Syntax #4
		int array4[] = new int[]{10, 20, 30, 40, 50};	// bracket after with new int
		
		// Syntax #5
		int array5[] = new int[5];				// create the array with size and no elements, making all the values as by default 0
		
		// write the data later as per our requirement
		array5[0] = 1;
		array5[1] = 2;
		array5[2] = 3;
		array5[4] = 5;
		
		// Syntax #6
		int[] array6 = new int[10];	// all the elements will be 0 by default
		
		ArraySyntaxes.printArray(array1);
		ArraySyntaxes.printArray(array2);
		ArraySyntaxes.printArray(array3);
		ArraySyntaxes.printArray(array4);
		ArraySyntaxes.printArray(array5);
		ArraySyntaxes.printArray(array6);

	}

}


public class ArrayCopy {

	public static void main(String[] args) {
		
		char[] array1 = {'H', 'A', 'P', 'P', 'Y', 'C', 'O', 'D', 'I', 'N', 'G'};
		System.out.println("array1 is: "+array1);
		
		String string = new String(array1);	// we can create a String of characters :)
		System.out.println("string is: "+string);
		
		// character array with size as 6
		char[] array2 = new char[6];
		
		System.arraycopy(array1, 5, array2, 0, 6);
		
		String copiedString = new String(array2);	// we can create a String of characters :)
		System.out.println("copiedString is: "+copiedString);
		
	}

}

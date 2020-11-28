
public class MutableStrings {

	public static void main(String[] args) {
		
		// Immutable String
		String str = new String("Hello");
		String concatenatedString = str.concat(" World");
		System.out.println("str is: "+str);
		System.out.println("concatenatedString is: "+concatenatedString); 
		
		// Mutable String
		// can not be used as interned string
		// THREAD SAFE
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		System.out.println("buffer is: "+buffer);
		

		// NOT THREAD SAFE
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		System.out.println("builder is: "+builder);
		
		builder.delete(0, 2);
		System.out.println("builder now is: "+builder);
		
		builder.insert(3, "Awesome");
		System.out.println("builder finally is: "+builder);
		
	}

}

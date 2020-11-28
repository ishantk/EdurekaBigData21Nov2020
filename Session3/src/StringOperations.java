
public class StringOperations {

	public static void main(String[] args) {
		
		// str1 and str2 are reference variables, which point to the same string literal Hello
		// interned strings
		String str1 = "Hello";
		String str2 = "Hello";
		
		// str3 and str4 are reference variables, which points to the string objects in the memory having hello as its contents
		// object strings
		String str3 = new String("Hello");
		String str4 = new String("HeLLO");
		
		// Printing the reference variables of String will give us the data directly unlike arrays giving hashcodes
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		// == operator is comparing not the contents but the references :)
		
		if(str1 == str2) { 
			System.out.println("str1 == str2"); // OK
		}else {
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4) {
			System.out.println("str3 == str4");
		}else {
			System.out.println("str3 != str4"); // OK
		}
		
		if(str1 == str3) {
			System.out.println("str1 == str3");
		}else {
			System.out.println("str1 != str3"); // OK
		}
		
		// equals -> compares content i.e. Hello with Hello
		if(str1.equals(str2)) {
			System.out.println("str1 equals str2");
		}else {
			System.out.println("str1 not equals str2");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3 equals str4");
		}else {
			System.out.println("str3 not equals str4");
		}
		
		boolean result = str1.equals(str3);
		
		if(result) {
			System.out.println("str1 equals str3");
		}else {
			System.out.println("str1 not equals str3");
		}
		
		
		if(str1.compareTo(str2) == 0) {
			System.out.println("str1 compareTo str2");
		}else {
			System.out.println("str1 not compareTo str2");
		}
		
		if(str3.compareTo(str4) == 0) {
			System.out.println("str3 compareTo str4");
		}else {
			System.out.println("str3 not compareTo str4");
		}
		
		if(str1.compareTo(str3) == 0) {
			System.out.println("str1 compareTo str3");
		}else {
			System.out.println("str1 not compareTo str3");
		}
		
		
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("str3 equalsIgnoreCase str4");
		}else {
			System.out.println("str3 not equalsIgnoreCase str4");
		}
		
		if(str3.compareToIgnoreCase(str4) == 0) {
			System.out.println("str3 compareToIgnoreCase str4");
		}else {
			System.out.println("str3 not compareToIgnoreCase str4");
		}

	}

}

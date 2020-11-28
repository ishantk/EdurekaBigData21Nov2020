
public class StringBuiltInMethods {

	public static void main(String[] args) {
		
		// String are IMMUTABLE -> Strings cannot be modified. Once a string created it will not be modified
		String names = "John, Jennie, Jim, Jack, Joe";
		
		System.out.println("names is: "+names);
		
		// Any Manipulation Operation on String will produce a new String in the memory
		String upperCaseNames = names.toUpperCase(); // toLowerCase
		
		// we have a String John, Jennie, Jim, Jack, Joe referred by names
		// if we manipulate the string and make names to re-refer the new String i.e. JOHN, JENNIE, JIM, JACK, JOE
		// no one will point to the old String which will remain in the memory
		//names = names.toUpperCase(); // this is actually not a good practice
		
		System.out.println("names now is: "+names);
		System.out.println("upperCaseNames is: "+upperCaseNames);
		
		int index = names.indexOf('o');	// starts searching the index from beginning
		System.out.println("index of o is: "+index);
		
		char ch = names.charAt(index);
		System.out.println("ch is: "+ch);
		
		index = names.lastIndexOf('o'); // starts searching the index from ending
		System.out.println("last index of o is: "+index);
		
		int length = names.length();
		System.out.println("Length of names is: "+length);
		
		ch = names.charAt(length-1);
		System.out.println("ch is: "+ch); // e
		
		//String name = names.substring(6);
		String name = names.substring(6, 12); // start from 6 less than 12
		System.out.println("name is: "+name);
		
		String email = "john@example.com";
		String password = "password123";
		
		if(email.contains("@") && email.contains(".")) {
			System.out.println("Valid Email");
		}else {
			System.out.println("InValid Email");
		}
		
		if(password.length() > 6) {
			System.out.println("Valid Password");
		}else {
			System.out.println("InValid Password");
		}
		
		String songName = "abc.mp3";
		System.out.println("Can we Play this Audio File: "+songName.endsWith(".mp3"));
		
		// startsWith :)
		
		String quote = "Search the Candle rather than nursing the darkness";
		String rectifiedQuote = quote.replace("nursing", "cursing");
		
		System.out.println("quote is: "+quote);
		System.out.println("rectifiedQuote is: "+rectifiedQuote);
		
		String scholarName = "dennis ritchie";
		String scholarNameForURL = scholarName.replace(" ", "+");
		
		String url = "https://scholar.google.com/scholar?hl=en&q="+scholarNameForURL;
		System.out.println("URL : "+url);
		
	}

}

// OutComes: 
// 1. String Equality
// 2. String Immutability
// 3. Manipulation on String returns a new String
// 4. Various built In Methods to perform String operations for algorithms :)

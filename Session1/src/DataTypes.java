
public class DataTypes {

	public static void main(String[] args) {
		
		// We are creating all these containers/variables in the main
		// i.e. they will be created/destroyed alongwith main
		// and we call them as local variables :)
		
		// byte is just 1 byte of data and is in the range of -128 to 127
		//byte cases = 9050613;
		
		// 2 bytes
		//short cases = 9050613;
		
		// int is 4 bytes and has the range to fit in the data :)
		int cases = 9050613;
		cases = 92123456;	// cases represents a variable whose value can be changed/modified
		
		//int worldWideCases = 3353312345531;
		
		// 8 bytes i.e. 64 bits
		long worldWideCases = 3353312345531L; // Create Operation
		
		// Storage containers can be modified :)
		worldWideCases = 543342567282L; // Update Operation
		
		System.out.println("Cases in India: "+cases);
		System.out.println("Cases World Wide: "+worldWideCases); // Read Operation
		
		// Number : Stores integers: byte, short, int and long :)
		
		// 4 bytes | 32 bits
		//float tested = 45.5f;
		
		// 8 bytes | 64 bits
		double tested = 45.5;
		
		// in single quotes we can store only 1 character :)
		char ch = 'A';				// Flat character
		char a = 65;				// ASCII Code
		char rupee = '\u20b9';		// UNICODE
		char letterA = '\u0905';
		System.out.println(ch);
		System.out.println(a);
		System.out.println(rupee);
		System.out.println(letterA);
		
		// Assignment: Print your name in your regional language with unicodes :)
		// Refer this link: https://unicode-table.com/en/
		
		
		boolean gps = true;
		gps = false;
		
		boolean internet = false;
		internet = true;
		
		System.out.println("IS GPS ENABLED: "+gps);
		System.out.println("IS INTERNET ENABLED: "+internet);
		
		// In java we have God Class i.e. Object
		// which can point to any type :)
		/*Object o = 'A';
		o = 10;
		o = 465375242L;
		o = 5.5;*/
		
		// Strings are non primitive i.e. Reference Type
		// They do not hold the data rather in the background they have memory mapping :)
		String name = "John Watson";
		System.out.println("Name is: "+name);
	}

}


public class DataTypeConversion {

	public static void main(String[] args) {
		
		byte age = 20;	// 8 bits of data

		// Implicit Conversion from byte to int
		int johnsAge = age; // 8 bits of data can be copied into 32 bits of container very easily
		
		// error below :)
		//byte joesAge = johnsAge; // err: we are putting 32 bits into 8 bits even if data can be accommodated :(

		// Explicit Casting
		byte joesAge = (byte)johnsAge;
		
		float maharashtraCases = 45.5F;
		double indiaCases = 97.5;
		
		//float cases = indiaCases + maharashtraCases;

		// Explicit Casting -> DownCasting | 64bits -> 32bits
		//float cases = (float)indiaCases + maharashtraCases;
		
		// because we have cases as a resultant variable to store result in 64 bits itself
		// UpCasting -> 32 bits -> 64 bits
		double cases = indiaCases + maharashtraCases;
		
		// PS: For UpCasting it is taken care automatically
		//     But for DownCasting we need to take care of by putting the (cast)
		
		String number1 = "23";
		String number2 = "46";
		
		String stringResult = number1 + number2;
		System.out.println("stringResult is: "+stringResult);
		
		// Casting may not be working for different type of data as in primitve and reference :(
		//int result = (int)number1 + (int)number2;
		
		// We need to Convert the Data into Different Types
		int result = Integer.parseInt(number1) + Integer.parseInt(number2);
		System.out.println("Result is:"+result);

	}

}

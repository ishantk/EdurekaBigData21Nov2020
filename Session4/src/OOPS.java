/*
 
 Principle of OOPS
 ------------------
 MakeMyTrip - Use Case :)
  
 1. Think of Object
 	1.1. Think of Attributes associated to an Object (Data Associated to an Object)
 	Think as much as attribute you can think of for creating an object:)
 
 2. Code the Object as Class
 	 i.e. we need to create a class that shall represent what we want in object

 3. Create the real object in the memory
     i.e. may be in main method and read/write the data in it
     
     Object: 		FlightBooking
     Attributes:	from, to, departureDate, returnDate, numberOfTravellers, travelClass
     
     Object is acting as a CONTAINER i.e. BOX full of Information :)
     
 */


// 1. Think of Object
// Object: 		FlightBooking
// Attributes:	from, to, departureDate, returnDate, numberOfTravellers, travelClass

// 2. Code the Object as Class
//    class is basically a textual representation of an object
//    whatever we code in class, is basically the property associated to the object
//	  i.e. everything written as non static belongs to object

class FlightBooking{	// we have created a class which is representation of the Object as a Container
	
	// Attributes : Instance Variables,  Data Members, state of an object
	String from;
	String to;
	String departureDate;
	String returnDate;
	int numberOfTravellers;
	char travelClass;			// E (Economy), P(Premium Economy), B(Business)
	
	
	// Constructors
	// Constructors are the methods inside the objects which gets executed as in when we create the object
	// Purpose is to initialize the attributes inside the objects :)
	FlightBooking() { // Default Constructor -> To Provide Default Values :)
		// Gets Executed for every single object which we create
		System.out.println("FlightBooking Object Constructed - Default");
		from = "Delhi";
		to = "Bangalore";
		departureDate = "30th November, 2020";
		returnDate = "";
		numberOfTravellers = 1;
		travelClass = 'E';		
	}
	
	// Parameterized Constructor -> To Provide Default Values from the Inputs of Constructor :)
	FlightBooking(String from, String to, String departureDate, String returnDate, int numberOfTravellers, char travelClass) {
		// Gets Executed for every single object which we create
		System.out.println("FlightBooking Object Constructed - Parameterized");
		/* Warning and State of Confusion: LHS and RHS is object's attribute or constructor's input variable :)
		from = from;
		to = to;
		departureDate = departureDate;
		returnDate = returnDate;
		numberOfTravellers = numberOfTravellers;
		travelClass = travelClass;
		*/		
		
		// this.from -> is the from attributes of object in LHS now
		// this is a reference variable inside the class available to us so as to differentiate between object's attributes and inputs
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.numberOfTravellers = numberOfTravellers;
		this.travelClass = travelClass;
	}
	
	
	// Method to Set/Update the data in Object
	void setDataInFlightBooking(String from, String to, String departureDate, String returnDate, int numberOfTravellers, char travelClass) {
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.numberOfTravellers = numberOfTravellers;
		this.travelClass = travelClass;
	}
	
	void showFlightBookingDetails() {
		System.out.println("Flight Booking Details");
		System.out.println("----------------------");
		System.out.println("From: "+from+" To: "+to+" On "+departureDate+" "+numberOfTravellers+" Travellers");
		System.out.println("Return: "+returnDate);
		System.out.println("Travel Class: "+travelClass);
		System.out.println("----------------------");
		System.out.println();
	}
	
}

public class OOPS {

	public static void main(String[] args) {
		
		// 3. Create the real object in the memory
		//    we will come to the main method and create objects
		
		// Object Construction Statement | Instantiation Process
		// Object is also known as Instance of Class :)
		//						  FlightBooking(); -> execution of default constructor
		FlightBooking fRef1 = new FlightBooking();		// Object Construction with new
		FlightBooking fRef2 = new FlightBooking();		// Object Construction with new
		FlightBooking fRef3 = fRef1;					// Reference Copy | GoogleMail can be accessed on the Laptop and Mobile both
		
		System.out.println("fRef1 is: "+fRef1);
		System.out.println("fRef2 is: "+fRef2);
		System.out.println("fRef3 is: "+fRef3);
		
		// new is an operator which will create the object for us 
		// that too whenever program is in execution phase i.e. objects are created at run time i.e. dynamically
		// new returns the hashcode of object which we store in reference variables.
		
		// So, here fRef1, fRef2, fRef3 are reference variables and NOT objects :) 
		
		// Operations on Object
		// 1. Write/Update
		// 2. Read
		// 3. Delete
		
		// 1. Write or Update
//		fRef1.from = "Delhi";
//		fRef1.to = "Bangalore";
//		fRef3.departureDate = "7th December 2020";
//		fRef3.returnDate = "10th December 2020";
//		fRef1.numberOfTravellers = 2;
//		fRef1.travelClass = 'P';
		
		fRef1.setDataInFlightBooking("Delhi", "Bangalore", "7th December 20202", "10th December 2020", 2, 'P');
//		
//		fRef2.from = "Goa";
//		fRef2.to = "Mumbai";
//		fRef2.departureDate = "25th December 2020";
//		fRef2.returnDate = "30th December 2020";
//		fRef2.numberOfTravellers = 4;
//		fRef2.travelClass = 'B';
		
		fRef2.setDataInFlightBooking("Goa", "Mumbai", "25th December 20202", "30th December 2020", 4, 'B');
		
		fRef3.departureDate = "6th December 2020"; // updated the data
		
		// 2. Read
		//System.out.println("FlightBooking Details: From "+fRef1.from+" To "+fRef3.to+" On "+fRef1.departureDate+" for "+fRef1.numberOfTravellers+" passengers");
		//System.out.println("FlightBooking Details: From "+fRef2.from+" To "+fRef2.to+" On "+fRef2.departureDate+" for "+fRef2.numberOfTravellers+" passengers");
		
		fRef1.showFlightBookingDetails();
		fRef2.showFlightBookingDetails();
		
		// 3. Delete
		// Objects will be deleted from the memory automatically whenever they are not being used
		// GarbageCollector is a Thread i.e. a Program in JVM which executes at a certain interval of time and manages objects
		// GC will be responsible to delete the objects automatically
		// BUT, we can also request GC to Run
		System.gc(); // executing GC and requesting to remove some unused objects :)
		
		
		// Default Constructor in Action
		FlightBooking booking = new FlightBooking(); 
		//System.out.println("FlightBooking Details: From "+booking.from+" To "+booking.to+" On "+booking.departureDate+" for "+booking.numberOfTravellers+" passengers");
		booking.showFlightBookingDetails();
		
		// Parameterized Constructor in Action
		FlightBooking usaBooking = new FlightBooking("San Farnscico", "New York", "30th November, 2020", "", 1, 'E');
		//System.out.println("FlightBooking Details: From "+usaBooking.from+" To "+usaBooking.to+" On "+usaBooking.departureDate+" for "+usaBooking.numberOfTravellers+" passengers");
		usaBooking.showFlightBookingDetails();
	}

}

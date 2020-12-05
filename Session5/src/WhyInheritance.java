/*
// One Way Flight
class FlightBooking{
	
	// Attributes : Instance Variables,  Data Members, state of an object
	String from;
	String to;
	String departureDate;
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
		numberOfTravellers = 1;
		travelClass = 'E';		
	}
	
	// Parameterized Constructor -> To Provide Default Values from the Inputs of Constructor :)
	FlightBooking(String from, String to, String departureDate, int numberOfTravellers, char travelClass) {
		// Gets Executed for every single object which we create
		System.out.println("FlightBooking Object Constructed - Parameterized");
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.numberOfTravellers = numberOfTravellers;
		this.travelClass = travelClass;
	}
	
	void showFlightBookingDetails() {
		System.out.println("Flight Booking Details");
		System.out.println("----------------------");
		System.out.println("From: "+from+" To: "+to+" On "+departureDate+" "+numberOfTravellers+" Travellers");
		System.out.println("Travel Class: "+travelClass);
		System.out.println("----------------------");
		System.out.println();
	}
	
}

// Flight With Return Ticket
class FlightBookingWithReturn{
	
	// Attributes : Instance Variables,  Data Members, state of an object
	String from;
	String to;
	String departureDate;
	int numberOfTravellers;
	char travelClass;			// E (Economy), P(Premium Economy), B(Business)
	
	String returnDate;
	
	// Constructors
	// Constructors are the methods inside the objects which gets executed as in when we create the object
	// Purpose is to initialize the attributes inside the objects :)
	FlightBookingWithReturn() { // Default Constructor -> To Provide Default Values :)
		// Gets Executed for every single object which we create
		System.out.println("FlightBooking Object Constructed - Default");
		from = "Delhi";
		to = "Bangalore";
		departureDate = "30th November, 2020";
		numberOfTravellers = 1;
		travelClass = 'E';		
	}
	
	// Parameterized Constructor -> To Provide Default Values from the Inputs of Constructor :)
	FlightBookingWithReturn(String from, String to, String departureDate, int numberOfTravellers, char travelClass, String returnDate) {
		// Gets Executed for every single object which we create
		System.out.println("FlightBooking Object Constructed - Parameterized");
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.numberOfTravellers = numberOfTravellers;
		this.travelClass = travelClass;
		this.returnDate = returnDate;
	}
	
	void showFlightBookingDetails() {
		System.out.println("Flight Booking Details");
		System.out.println("----------------------");
		System.out.println("From: "+from+" To: "+to+" On "+departureDate+" "+numberOfTravellers+" Travellers");
		System.out.println("Travel Class: "+travelClass);
		System.out.println("Return Date: "+returnDate);
		System.out.println("----------------------");
		System.out.println();
	}
	
}

class FlightBookingForMultipleCities{
	
	// Attributes : Instance Variables,  Data Members, state of an object
	String from;
	String to;
	String departureDate;
	int numberOfTravellers;
	char travelClass;			// E (Economy), P(Premium Economy), B(Business)
	
	String returnDate;
	
	String anotherFrom;
	String anotherTo;
	String anotherDepartureDate;
	int anotherNumberOfTravellers;
	char anotherTravelClass;			// E (Economy), P(Premium Economy), B(Business)
	
	String anotherReturnDate;
	
	// Constructors
	// Constructors are the methods inside the objects which gets executed as in when we create the object
	// Purpose is to initialize the attributes inside the objects :)
	FlightBookingForMultipleCities() { // Default Constructor -> To Provide Default Values :)
		// Gets Executed for every single object which we create
		System.out.println("FlightBooking Object Constructed - Default");
		from = "Delhi";
		to = "Bangalore";
		departureDate = "30th November, 2020";
		numberOfTravellers = 1;
		travelClass = 'E';		
	}
	
	// Parameterized Constructor -> To Provide Default Values from the Inputs of Constructor :)
	FlightBookingForMultipleCities(String from, String to, String departureDate, int numberOfTravellers, char travelClass, String returnDate) {
		// Gets Executed for every single object which we create
		System.out.println("FlightBooking Object Constructed - Parameterized");
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.numberOfTravellers = numberOfTravellers;
		this.travelClass = travelClass;
		this.returnDate = returnDate;
	}
	
	void showFlightBookingDetails() {
		System.out.println("Flight Booking Details");
		System.out.println("----------------------");
		System.out.println("From: "+from+" To: "+to+" On "+departureDate+" "+numberOfTravellers+" Travellers");
		System.out.println("Travel Class: "+travelClass);
		System.out.println("Return Date: "+returnDate);
		System.out.println("----------------------");
		System.out.println();
	}
	
}
*/

// Parent
class FlightBooking{
	
	// Attributes : Instance Variables,  Data Members, state of an object
	String from;
	String to;
	String departureDate;
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
		departureDate = "5th December, 2020";
		numberOfTravellers = 1;
		travelClass = 'E';		
	}
	
	// Parameterized Constructor -> To Provide Default Values from the Inputs of Constructor :)
	FlightBooking(String from, String to, String departureDate, int numberOfTravellers, char travelClass) {
		// Gets Executed for every single object which we create
		System.out.println("FlightBooking Object Constructed - Parameterized");
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.numberOfTravellers = numberOfTravellers;
		this.travelClass = travelClass;
	}
	
	void showFlightBookingDetails() {
		System.out.println("Flight Booking Details");
		System.out.println("----------------------");
		System.out.println("From: "+from+" To: "+to+" On "+departureDate+" "+numberOfTravellers+" Travellers");
		System.out.println("Travel Class: "+travelClass);
		System.out.println("----------------------");
		System.out.println();
	}
	
}

// Flight With Return Ticket
class FlightBookingWithReturn extends FlightBooking{ // Inheritance Relationship
	
	String returnDate; // have additional attributes here
	// As all others will be accessible from the Parent Object
	
	// Constructors
	// Constructors are the methods inside the objects which gets executed as in when we create the object
	// Purpose is to initialize the attributes inside the objects :)
	FlightBookingWithReturn() { // Default Constructor -> To Provide Default Values :)
		// Gets Executed for every single object which we create
		System.out.println("FlightBookingWithReturn Object Constructed - Default");
		returnDate = "10th December 2020";
	}
	
	// Parameterized Constructor -> To Provide Default Values from the Inputs of Constructor :)
	FlightBookingWithReturn(String from, String to, String departureDate, int numberOfTravellers, char travelClass, String returnDate) {
		super(from, to, departureDate, numberOfTravellers, travelClass);
		// Gets Executed for every single object which we create
		System.out.println("FlightBookingWithReturn Object Constructed - Parameterized");
		this.returnDate = returnDate;
	}
	
	void showFlightBookingDetails() {
		super.showFlightBookingDetails();
		System.out.println("FlightBookingWithReturn Booking Details");
		System.out.println("Return Date: "+returnDate);
		System.out.println();
	}
}

// Assignmnet: implement the class below
class FlightBookingMulticity{
	
}

public class WhyInheritance {

	public static void main(String[] args) {
		
		//FlightBooking fRef = new FlightBooking();
		//fRef.showFlightBookingDetails();
		
		//FlightBookingWithReturn fRef = new FlightBookingWithReturn();
		//fRef.showFlightBookingDetails();
		
		FlightBookingWithReturn fRef = new FlightBookingWithReturn("Goa", "Pune", "7th December 2020", 2, 'B', "1st Jan 2021");
		fRef.showFlightBookingDetails();
	}

}

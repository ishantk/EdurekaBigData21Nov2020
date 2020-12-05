import java.util.Date;

interface NotificationHandler{
	// the methods in interface are by default public and abstract
	void notify(String message); // -> public abstract void notify(String message);
	void sendEmail(String emailContent);
}

interface LocationHandler{
	void updateLocationsOfDeliveryPerson(String newLocation);
}

class FoodOrder{
	
	int oid;
	int price;
	int state;	// 1 -> Food Order is confirmed by Restaurant 2 -> Picked Up by Delivery Person 3 -> Order Delivered to Customer
	String description;
	
	//CustomerApp customer; // Has-A Relationship
	
	// Reference to Interfaces
	// Polymorphic Approach: Reference Variable of Interfaces can point to the Objects of classes which implements them
	private NotificationHandler handler;
	private LocationHandler locationHandler;
	
	void subscribeForNotifications(NotificationHandler handler) {
		this.handler = handler;
	}
	
	void subscribeForLocation(LocationHandler locationHandler) {
		this.locationHandler = locationHandler;
	}
	
	void setState(int state) {
		this.state = state;
		if(state == 1) {
			handler.notify("Food Order is confirmed by Restaurant");
		}else if(state == 2) {
			handler.notify("Picked Up by Delivery Person");
		}else if(state == 3) {
			handler.notify("Order Delivered to Customer");
			handler.sendEmail("Thank You for Ordering "+description+" with us.");
		}
	}
}

// interfaces are implemented :)
class CustomerApp implements NotificationHandler, LocationHandler{ // multiple Implementations
	
	String name;
	String phone;
	String email;
	
	// define the method in the class which implements interface
	public void notify(String message) {
		System.out.println("-----------CUSTOMER APP------------");
		Date date = new Date();
		System.out.println("A New Notification Arrived "+date.toString());
		System.out.println(message);
		System.out.println("-----------CUSTOMER APP------------");
	}
	
	public void sendEmail(String emailContent) {
		System.out.println("Email with "+emailContent+" sent over to customer email "+email);
	}
	
	public void updateLocationsOfDeliveryPerson(String newLocation) {
		
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		
		CustomerApp cRef = new CustomerApp();
		cRef.name = "John Watson";
		cRef.email = "john@example.com";
		cRef.phone = "+91 99999 11111";
		
		FoodOrder order = new FoodOrder();
		order.oid = 1;
		order.description = "Paneer Tikka, Butter Nan";
		order.price = 1000;
		order.oid = 0;
		
		// Linking Customer to FoodOrder with Has-A Relationship
		//order.customer = cRef; // Reference Copy
		//order.handler = cRef; //Reference Variable of Interface is holding reference of the Object which implements it
		//order.locationHandler = cRef;
		
		order.subscribeForNotifications(cRef);
		order.subscribeForLocation(cRef);
		
		// When Restaurant will accept the order.
		//order.setState(1);
		
		// When Delivery Person will pickup the order.
		//order.setState(2);
		
		// When Delivery Person will deliver the order.
		order.setState(3);
		
		
	}

}

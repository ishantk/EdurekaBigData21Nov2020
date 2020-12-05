// Now, we as developer cannot create object of GooglePay
abstract class GooglePay{
	
	boolean isBankAvailable = false;
	
	final void payWithUPIOnGooglePay(int amount) {
		
		System.out.println("[Google Pay] Transaction In Process through UPI On Google Pay for amount: \u20b9"+amount);
		
		if(isBankAvailable) {
			onSuccess();
		}else {
			onFailure();
		}
	}
	
	// abstract method has no definition
	// it has to be created within abstract class
	// method to tell payment is success
	abstract void onSuccess();
	
	// method to tell payment failed
	abstract void onFailure();
	
	// PS: Abstract Methods are the RULES created by Parent
	//     which child must define
	
}


class ZomatoPayments extends GooglePay{
	
	void onSuccess() {
		System.out.println("[Zomato] Payment was received successfully :)");
		System.out.println("[Zomato] Your Order has been Placed");
	}
	
	void onFailure() {
		System.out.println("[Zomato] Payment Failed :( ");
		System.out.println("[Zomato] Please ReTry the Payment to Process Your Order");
	}
	
}


public class AbstractClass {

	public static void main(String[] args) {
	
		// we now cannot create object of GooglePay and use its methods as such :)
		//GooglePay pay = new GooglePay(); // error
		
		ZomatoPayments payments = new ZomatoPayments();
		payments.payWithUPIOnGooglePay(500);

	}

}


public class Overloading {

	/*
	void loginWithPhone(String phoneNumber) {
		System.out.println("Logging you in with "+phoneNumber+" and OTP sent on your phone");
	}
	
	void loginWithEmailAndPassword(String email, String password) {
		System.out.println("Logging you in with "+email+" and "+password);
	}
	
	void loginWithFacebook(String facebookUserName) {
		System.out.println("Logging you in with "+facebookUserName);
	}
	*/
	
	// Method Overloading -> SAME NAME and DIFFERENT INPUTS
	//					  -> Return Types will have no impact
	
	void login(String phoneNumber) {
		System.out.println("Logging you in with "+phoneNumber+" and OTP sent on your phone");
	}
	
	void login(String email, String password) {
		System.out.println("Logging you in with "+email+" and "+password);
	}
	
	void login(String facebookUserName, int i) {
		System.out.println("Logging you in with "+facebookUserName);
	}
	
	public static void main(String[] args) {
		
		Overloading ref = new Overloading();
		
		// Polymorphism -> Same Method doing different types of login for us :)
		ref.login("+91 99999 11111");
		ref.login("john@example.com", "john123");
		ref.login("john.watson", 101);

	}

}

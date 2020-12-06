package co.edureka.two;

// import the class One
import co.edureka.one.One;		// public: is accessible even outside the package
//import co.edureka.one.Three;	// default: is not accessible outside the package and remain only inside the package

// Inheritance across packages
class Child extends One{
	
	void hello() {
		// outside the package child can access protected and public
		protShow(); // restricted to be used only inside the child class as parent is from another package
		pubShow();
		
		// outside the package child cannot access private or default
		//defShow();
		//pvtShow();
	}
	
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow();	// private is not accessible in the class itself, so outside the package makes no sense
		//oRef.defShow();	// default is not accessible outside the package
		//oRef.protShow();  // protected is also not accessible outside the package, but in case we have inheritance, this can be accessed by child
		oRef.pubShow();     // public visible everywhere
		
		Child cRef = new Child();
		//cRef.pubShow();
		//cRef.protShow();// direct access is not granted
		
		cRef.hello();
	}

}

// From Java 8th version onwards, we can define the methods
interface Inf{
	
	// This is strictly suppose to be executed with the reference of Interface and not by it directly :)
	default void show() {
		System.out.println("This is show from Inf");
		hi();
	}
	
	private void hi() {
		System.out.println("This is hi from Inf");
	}
	
	static void hola() {
		System.out.println("This is hola from Inf");
		heya();
	}
	
	private static void heya() {
		System.out.println("This is heya from Inf");
	}
	
	void hello();
}

class AD implements Inf{
	public void hello() {
		System.out.println("This is hello in AD of Inf");
	}
}


public class InterfacesMethods {

	public static void main(String[] args) {
		
		Inf iRef = new AD();
		iRef.show();
		iRef.hello();
		//iRef.hola(); // error
		
		// static methods in interfaces can be accessed directly by their name :)
		Inf.hola();
		
	}

}

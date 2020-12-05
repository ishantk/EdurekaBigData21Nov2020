// final class cannot be extended
final class CA{
	final void pay() { // final cannot be overrided in child :)
		
	}
}

class CB{// extends CA{
	/*void pay() {
		
	}*/
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		final int i = 10; // final -> we cannot change the value afterwards :)
		//i = 100; // error

	}

}


interface Inf1{
	void show();
}

interface Inf2{
	// if we create some variables they will be constants by default
	int version = 1;	// -> public static final int version = 1;
	void hello();		// -> public abstract void hello();
	void show();
}

// Inheritance on Interfaces
// 1 Interface can extend in multiple ways :)
interface Inf3 extends Inf1, Inf2{
	
}

class AB{
	void hi() {
		System.out.println("This is hi from AB");
	}
}

class CA extends AB implements Inf3{//Inf1, Inf2{
	
	public void show() {
		System.out.println("This is show: "+version);
	}

	public void hello() {
		hi();
		System.out.println("This is hello");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		
		// Polymorphic Statement: Ref Var of Interface can refer tot he Object of class which implements it :)
		//Inf1 i1 = new CA(); 
		//i1.show();
		//i1.hello(); // error: hello is not a part of Inf1
		
		/*Inf2 i2 = new CA(); 
		i2.show();
		i2.hello();
		System.out.println("Version is: "+Inf2.version);
		System.out.println("Version is: "+i2.version);*/
		
		//Objects cannot be created for interfaces :)
		//Inf2 iRef = new Inf2();
		
		Inf3 i3 = new CA();
		i3.show();
		i3.hello();
		System.out.println("Version is: "+Inf3.version);
		System.out.println("Version is: "+i3.version);
		
		//i3.hi(); // error -> remember we can execute only those methods which are declared in interfaces :)
		
		// PS: Multiple Implementation and Multiple Extension allowed on Interfaces :)
		
		System.out.println();
		
		CA cRef = new CA();
		cRef.show();
		cRef.hello();
		cRef.hi();
		System.out.println("Version is: "+CA.version);
		System.out.println("Version is: "+cRef.version);
	}

}

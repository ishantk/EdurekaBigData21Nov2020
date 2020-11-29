class Parent{
	
	String fname;
	String lname;
	int wealth;
	
	Parent(){
		fname = "John";
		lname = "Watson";
		wealth = 100000;
		System.out.println("Parent Object Constructed");
	}
	
	void showDetails() {
		System.out.println("---------------");
		System.out.println("Parent Details");
		System.out.println(fname+" "+lname);
		System.out.println("\u20b9 "+wealth);
		System.out.println("---------------");
	}
}

// Inheritance Relationship
// LHS of extends keyword is Child class or Sub Class whereas RHS is Parent Class or super class
class Child extends Parent{
	
	String fname;
	String companyName;
	int wealth;
	
	Child(){
		fname = "Fionna";
		companyName = "ABC International";
		wealth = 50000;
		System.out.println("Child Object Constructed");
	}
	
	// Over-Riding
	// ReDefining the same property of the parent in the Child
	void showDetails() {
		// execute the method of Parent 
		super.showDetails(); // super is a reference variable which can refer to the Parent object from the Child
		
		System.out.println("---------------");
		System.out.println("Child Details");
		System.out.println(fname+" "+lname);
		System.out.println(companyName);
		System.out.println("\u20b9 "+wealth);
		System.out.println("---------------");
	}
	
}

// 1. Rule of Inheritance
//    Whenever we give the command to create object of Child.
//    JVM will create Parent Object first and than the Child Object :)

// 2. Rule of Inheritance
//    As a child, it can access everything of the Parent, if it does not have it :)
//    In Case child has the same property, it will access its own
//    if something is marked as private in Parent, that cannot be accessed by Child

public class WhatIsInheritance {

	public static void main(String[] args) {
		
		//Parent pRef = new Parent();
		//pRef.showDetails();
		
		Child cRef = new Child();
		//cRef.wealth = cRef.wealth - 5000;	// update the wealth of Parent as child wont have it:)
		cRef.wealth = cRef.wealth - 1000;	// update the wealth of Child as child has it:)
		
		// as child has no showDetails, it access and executes from the Parent
		cRef.showDetails();
		
		// error: super is accessible from the child class
		// cRef.super.showDetails();
	}

}

/*
 
 	Types of Inheritence
 
 	1. 
 	Single Level -> 1 Parent 1 Child
 	class CA{
 	
 	}
 	
 	class CB extends CA{
 	
 	}
 	
 	2.
 	Multi Level -> 1 Parent 1 Child 1 Grandhild ....
 	class CA{
 	
 	}
 	
 	class CB extends CA{
 	
 	}
 	
 	class CC extends CB{
 	
 	}
 	
 	3. Hierarchy | 1 Parent multiple Children
 	class CA{
 	
 	}
 	
 	class CB extends CA{
 	
 	}
 	
 	class CC extends CA{
 	
 	}
 	
 	4. Multiple | Not Supported
 	
 	class CA extends CB, CC{ // error -> cannot have more than 1 parent
 	
 	}
 	
 	5. Hybrid
 	1+2+3 -> any combination
 	
 	CA
 	|
 	CB
 	|
 CC   CD
      |	
      CE
      
 
 */

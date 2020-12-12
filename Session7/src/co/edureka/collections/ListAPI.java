package co.edureka.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Product{
	
	int pid;
	String name;
	int price;
	
	public Product() {
		
	}
	
	public Product(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return pid + "\t"+ name + "\t"+price;
	}
	
}

public class ListAPI {

	public static void main(String[] args) {
		
		Product p1 = new Product(101, "iPhone X", 50000);
		Product p2 = new Product(201, "Samsung LED", 60000);
		Product p3 = new Product(301, "Hitachi Refrigirator", 30000);
		Product p4 = new Product(401, "Bosch Washing Machine", 40000);
		Product p5 = new Product(501, "Adidas Shoe", 5000);
		
		// Polymorphic Statement -> list can refer to ArrayList Object
		//List list1 = new ArrayList();

		// Direct Object Construction
		// Hetrogeneous List
		//ArrayList list1 = new ArrayList();	// We can add any object in ArrayList
		//LinkedList list1 = new LinkedList();	// We can add any object in ArrayList
		Vector list1 = new Vector();	// We can add any object in ArrayList

		// Homogeneous List
		// Generics in Java -> list2 can only add String
		//ArrayList<String> list2 = new ArrayList<String>();
		//LinkedList<String> list2 = new LinkedList<String>();
		Vector<String> list2 = new Vector<String>();
		
		// Homogeneous List
		// Generics in Java -> cart can only add Product Objects
		//ArrayList<Product> cart = new ArrayList<Product>();
		//LinkedList<Product> cart = new LinkedList<Product>();
		Vector<Product> cart = new Vector<Product>();
		
		// Adding Data in List
		list1.add("John");		// 0
		list1.add(10);			// 1
		list1.add("Fionna");	// 2
		list1.add(100.235);		// 3
		list1.add(true);		// 4
		
		list2.add("John");		// 0
		list2.add("Fionna");	// 1
		list2.add("Sia");		// 2

		// Display the Data in List
		System.out.println(list1);
		System.out.println(list2);
		
		// Update the Element in List
		list1.set(1, "Harry");
		
		// Remove Data from List
		list1.remove(3);
		
		// Get Data from List
		Object data = list1.get(1);	// list1 being hetro we can read data as Object as we will dont know the type
		String name = list2.get(1);	// list2 being homo as String, we know the type and its is more safe
		
		System.out.println("data is: "+data);
		System.out.println("name is: "+name);
		
		System.out.println(list1);
		System.out.println("Size of list1 is: "+list1.size());
		
		// Remove all the elements :)
		list2.clear();
		
		System.out.println(list2);
		System.out.println("Size of list2 is: "+list2.size());
		
		cart.add(p1);
		cart.add(p2);
		cart.add(p3);
		cart.add(p4);
		cart.add(p5);
		
		System.out.println("Cart Size: "+cart.size());
		
		cart.remove(2);
		
		System.out.println("Cart Size: "+cart.size());
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println("Cart Items: "+cart.size());
		int totalAmount = 0;
		
		System.out.println("Products in Cart: ");
		
		// Regular For Loop
		/*for(int i=0;i<cart.size();i++) {
			Product p = cart.get(i);
			System.out.println(p);
			totalAmount += p.price;
		}*/
		
		// Enhanced For Loop
		/*for(Product p : cart) {
			System.out.println(p);
			totalAmount+= p.price;
		}*/
		
		Iterator<Product> itr = cart.iterator();
		while(itr.hasNext()) {
			Product p = itr.next();
			System.out.println(p);
			totalAmount += p.price;
		}
		
		System.out.println("Cart Total: "+totalAmount);
		System.out.println("---------------------------");
		
	}

}

// 1. Think of Object
// Employee: eid, name, salary

// 2. Create its class
class Employee{
	
	// Attributes
	int eid;
	String name;
	int salary;
	
	Employee() {
		//this(101, "George"); // we can even execute parameterized from default
		salary = 30000;
	}
	
	Employee(int eid, String name){
		// executing constructor from another constructor
		this(); // execute default constructor
		this.eid = eid;
		this.name = name;
	}
	
	void showEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println(eid+"\t"+name+"\t"+salary);
		System.out.println("----------------");
		System.out.println();
	}
	
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		// 3. Construct the Employee Objects
		Employee employee1 = new Employee(101, "Fionna");			// parameterized
		Employee employee2 = new Employee(102, "John");				// parameterized
		
		employee1.showEmployeeDetails();
		employee2.showEmployeeDetails();
		
	}

}

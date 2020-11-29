// Student: rollNumber, name, age

class Student{
	
	// non static
	// property of object
	int rollNumber;
	String name;
	int age;
	
	// static 
	// count variable is NOT the property of object
	// count variable is static and is the property of CLASS :)
	static int count; // default is 0 here
	
	Student(){
		rollNumber = 0;
		name = "";
		age = 0;
		count++; // increment the count
	}
	
	Student(int rollNumber, String name, int age){
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		count++; // increment the count
	}
	
	void setStudentDetails(int rollNumber, String name, int age){
		//count++; can be accessed
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}
	
	void showStudentDetails() {
		System.out.println("Student Details");
		System.out.println("------------------");
		System.out.println(rollNumber+" |\t"+name+"\t"+age);
		System.out.println("------------------");
		System.out.println();
	}
	
	// is property of class and not of Object
	static void showStudenCount() {
		System.out.println(count+" Students Registered");
		//rollNumber = 10; // error => we dont know whose rollNumber it would be
		// static methods cannot access non static properties of object :)
	}
}

class WhatsApp{
	
	String status;				// object attribute, which will be available in every object
	static String groupTitle;	// class attributes, which will be in class and will be available to all objects as a single attribute i.e. common for all
	
	void show() {
		System.out.println("Status is: "+status);
		System.out.println("Group is: "+groupTitle);
		System.out.println();
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		
		WhatsApp john = new WhatsApp();
		WhatsApp jennie = new WhatsApp();
		WhatsApp jack = new WhatsApp();
		
		john.status = "Be Exceptional";
		jennie.status = "Do Good";
		jack.status = "Work Hard";
		
		john.groupTitle = "Edureka Batch";
		
		john.show();
		jennie.show();
		jack.show();
		
		jack.groupTitle = "Fun Time";
		
		john.show();
		jennie.show();
		jack.show();
		
		/*
		
		Student s1 = new Student(1, "John", 16);
		Student s2 = new Student(2, "Fionna", 15);
		Student s3 = new Student(3, "Kia", 17);
		
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();
		Student s7 = new Student();
		
		s1.showStudentDetails();
		s2.showStudentDetails();
		s3.showStudentDetails();
		
		// any reference to the object can access count
		// count of class becomes a common variable for all the objects
		//s1.count = -10;

		System.out.println("Count is: "+Student.count);
		Student.showStudenCount();
		
		
		// PS: non static can access static
		//     static cannot access non static
		 
		 */
	}

}

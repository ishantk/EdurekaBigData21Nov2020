package co.edureka.one;

// public class
public class One {

	private void pvtShow() {
		System.out.println("This is private show of One");
	}
	
	void defShow() {
		System.out.println("This is default show of One");
	}
	
	protected void protShow() {
		System.out.println("This is protected show of One");
	}
	
	public void pubShow() {
		System.out.println("This is public show of One");
	}
	
}

// In one .java file, we can have only 1 public class
// As per the Rule, if we have a public class, .java file should be same name as of class name
/*public class Two {

}*/

// default classes :)
class Three{
	
	private void pvtShow() {
		System.out.println("This is private show of One");
	}
	
	void defShow() {
		System.out.println("This is default show of One");
	}
	
	protected void protShow() {
		System.out.println("This is protected show of One");
	}
	
	public void pubShow() {
		System.out.println("This is public show of One");
	}
	
}

/*class Four{
	
}*/

// classes cannot be private or protected
// they can be either public or default :)
/*
private class Five{
	
}

protected class Six{
	
}
*/

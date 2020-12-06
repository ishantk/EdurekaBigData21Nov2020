package co.edureka.one;

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow();	// private is not accessible
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		Three tRef = new Three();
		//tRef.pvtShow();	// private is not accessible
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}

// private: which is visible only within the block{ } of class :)


public class Labels {

	public static void main(String[] args) {
		
		// Nested For Loops: Loop inside a Loop :)
		
		outer:
		for(int i=1;i<=3;i++) {
			
			System.out.println("i is: "+i);	// 1
			
			inner:
			for(int j=1;j<=5;j++) {			// 1 2 3 4 5
				
				if(j>3) {
					//break;
					//break inner;
					break outer;
				}
				
				System.out.print(j+"  ");
			}
			
			System.out.println();			// new line
		}
	
		// Loops can have labels so that we can refer what to continue or what to break :) 
		// Try implementing continue :)

	}

}

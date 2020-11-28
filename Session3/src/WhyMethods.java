public class WhyMethods {
	
	// why methods ?
	// 1. we may write some piece of code again and again
	//    examples: showing the information to the user in a dialog
	//	  			checking internet connection again and again
	//			    we are kind of writing the same code again and again for various use cases or input
	
	// 2. our algorithm i.e. code to solve some problem has gone really vast
	// 	  we may not re-use it but for modularity of the program i.e. clean code -> we shall create a separate method

	
	static int getMaximumIndex(int[] array) {
		int maxIndex = 0;
		for(int i=1;i<array.length;i++) {
			if(array[i]>array[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static void main(String[] args) {
		
		// assuming last 5 days :(
		int[] covidCasesInMaharashtra = {1235, 4561, 3451, 5671, 2134};
		
		// product prices for product shoe on some e-commerce platform
		int[] productPrices = {3000, 1200, 4560, 3320, 8976};
		
		// requirement:
		// tell the day of maximum case
		// tell the maximum priced product
		
		/*int maxIndex = 0;
		for(int i=1;i<covidCasesInMaharashtra.length;i++) {
			if(covidCasesInMaharashtra[i] > covidCasesInMaharashtra[maxIndex]) {
				maxIndex = i;
			}
		}*/
		
		System.out.println("Covid Cases were maximumn of the day: "+(WhyMethods.getMaximumIndex(covidCasesInMaharashtra)+1));
		
		/*maxIndex = 0;
		for(int i=1;i<productPrices.length;i++) {
			if(productPrices[i] > productPrices[maxIndex]) {
				maxIndex = i;
			}
		}*/
		
		System.out.println("Product with Maximum Price is: "+productPrices[WhyMethods.getMaximumIndex(productPrices)]);

	}

}

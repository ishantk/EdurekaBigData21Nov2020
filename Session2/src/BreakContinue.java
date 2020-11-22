import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		String[] stateNames = {"Maharashtra", "Karnataka", "Andhra Pradesh", "Tamil Nadu", "Kerala"};
		int[] stateWiseActiveCases = {79873, 101, 17812, 691, 292};
		
		for(int idx=0; idx<stateNames.length; idx++) {
			System.out.println("State "+stateNames[idx]+" has "+stateWiseActiveCases[idx]+" active cases");
		}
		
		// Find the state having least cases :)
		
		// Assuming the 1st element is the lowest
		int minIdx = 0;	// assuming 79873 to be the lowest value :)
		
		// Hence, we start comparing with next element :)s
		for(int idx=1; idx<stateWiseActiveCases.length; idx++) { 
			// 1st comparison: stateWiseActiveCases[1]: 101 < stateWiseActiveCases[0] 79873
			// minIdx -> 1
			if(stateWiseActiveCases[idx] < stateWiseActiveCases[minIdx]) {
				minIdx = idx;	// change the index to the minimum cases index :)	
			}
		}
		
		System.out.println("STATE WITH MINIMUM ACTIVE CASES IS:");
		System.out.println(stateNames[minIdx]);
		System.out.println(stateWiseActiveCases[minIdx]);
		
		int totalActiveCases = 0;
		for(int idx=0; idx<stateWiseActiveCases.length; idx++) {
			totalActiveCases = totalActiveCases + stateWiseActiveCases[idx];
		}

		System.out.println("TOTAL ACTIVE CASES: "+totalActiveCases);
		
		
		// eCommerce
		int[] orderIDs = {2101, 1102, 1203, 4104, 6105};
		String[] products = {"Shoe", "Jacket", "Toy", "Cap", "Mobile"};
		double[] productPrices = {2000, 3000, 500, 500, 10000};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Order ID to be Searched: ");
		int orderId = scanner.nextInt();
		System.out.println("SEARCHING "+orderId+"...");
		
		// Algorithm: Linear Search
		// we are iterating in all the indexes of orderIDs
		
		int searchedIdx = -1;
		
		for(int idx=0;idx<orderIDs.length;idx++) {
			System.out.println("Comparing "+orderId+" with "+orderIDs[idx]);
			if(orderId == orderIDs[idx]) {
				System.out.println("ORDER ID: "+orderId+" Found:) ");
				searchedIdx = idx;
				break; // break will terminate the loop :)
			}
		}

		if(searchedIdx != -1) {
			System.out.println("ORDER ID: "+orderIDs[searchedIdx]+" Details...");
			System.out.println("PRODUCT: "+products[searchedIdx]);
			System.out.println("PRICE: "+productPrices[searchedIdx]);
		}else {
			System.out.println("SORRY, Order Not Found :(");
		}
		
		// Assuming eCommerce Platform is offering 25% Off for products > 2000
		for(int idx=0; idx<productPrices.length; idx++) {
			
			if(productPrices[idx]<=2000) {
				continue; // continue will skip the statements below and take the loop in next iteration
				// skip the statements below in the loop block
			}
			
			// decrease the prodcut price by 25%
			productPrices[idx] -= (0.25*productPrices[idx]);
		}
		
		for(int idx=0; idx<productPrices.length; idx++) {
			System.out.print(productPrices[idx]+"  ");
		}

	}

}

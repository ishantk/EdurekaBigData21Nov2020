public class MultiDimensionalArrays {

	static int sum(int[] array) {
		int sum = 0;
		
		// Enhanced for loop is a reader loop -> we will read elements of array one by one and we have no indexes :(
		for(int element: array) {
			sum += element;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		 //							   0      1		2	  3		4		| 5 states
		int[] democraticPartyVotes = {3413, 1341, 23451, 33421, 6543};
		int[] republicanPartyVotes = {23413, 2341, 13451, 63421, 7543};
		
		// Array of Arrays
		// Multi Dimensional Arrays
		int[][] votes = {
				// 0	 1	  2       3      4
				{3413, 1341, 23451, 33421, 6543},	// 0
				{23413, 2341, 13451, 63421, 7543}	// 1
		};
		
		int[][] array = new int[5][3]; // 5 arrays in Array with each array having 3 elements :)

		/*if(MultiDimensionalArrays.sum(democraticPartyVotes) > MultiDimensionalArrays.sum(republicanPartyVotes)) {
			System.out.println("Democratic Party Won");
		}else {
			System.out.println("Republican Party Won");
		}*/
		
		int demSum = MultiDimensionalArrays.sum(votes[0]);
		int repSum = MultiDimensionalArrays.sum(votes[1]);
		
		System.out.println("democraticPartyVotes sum "+demSum);
		System.out.println("republicanPartyVotes sum "+repSum);
		
		//if(MultiDimensionalArrays.sum(votes[0]) > MultiDimensionalArrays.sum(votes[1])) {
		if(demSum > repSum) {
			System.out.println("Democratic Party Won");
		}else {
			System.out.println("Republican Party Won");
		}
		
		
		System.out.println("votes is: "+votes);
		System.out.println("votes[0] is: "+votes[0]);
		System.out.println("votes[1] is: "+votes[1]);
		
		System.out.println("votes[0][4] is: "+votes[0][4]);
	}

}

// Assignment: Find the min and max of multi dimensional array :)

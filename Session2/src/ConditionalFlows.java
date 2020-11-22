
public class ConditionalFlows {

	public static void main(String[] args) {
		
		// REQUIREMENT
		// -----------
		// below 500 -> nothing
		
		// 500 to less than 1000 -> 30%OFF 		| PromoCode -> JUMBO
		// upto 100
		
		// 1000 to less than 2000 -> 50%OFF   	| PromoCode -> ZOMATO
		// upto 200
		
		// above 2000 -> 60%OFF					| PromoCode -> GOODFOODTRAIL
		// upto 500
		
		// Assignment: implement the cash back in the program :)
		// for using Paytm as Payment			| 10% CashBack
		
		// Step1:
		// ------
		// MODEL
		// Represent the data in above Requirement
		double totalPrice = 2500;
		
		// PromoCodes are mapped to integers :)
		int JUMBO = 1;
		int ZOMATO = 2;
		int GOODFOODTRAIL = 3;
		
		boolean isPaytmUsed = true;
		
		int promoCode = GOODFOODTRAIL; // assumption user has selected ZOMATO
		
		// Step2:
		// -----
		// CONTROLLER
		// Write the Logic -> Use Operators, if/else or loops (coming up next)
		
		/*
		if(totalPrice>=500 && totalPrice<1000) {
			
			if(promoCode == JUMBO) {
				
				double discount = 0.30 * totalPrice;
				
				if(discount > 100) {
					discount = 100;
				}
				
				totalPrice = totalPrice - discount;
				System.out.println("JUMBO APPLIED SUCCESSFULLY :)");
				System.out.println("DISCOUNTS: \u20b9"+discount);
				System.out.println("PLEASE PAY: \u20b9"+totalPrice);
				
			}else {
				System.out.println("Sorry, Invalid PromoCode :(");
			}
			
		}else {
			System.out.println("Sorry, No Discounts for You :( ");
		}
			
		*/	
		
		if(totalPrice>=500 && totalPrice<1000) {
			
			if(promoCode == JUMBO) {
				
				double discount = 0.30 * totalPrice;
				
				if(discount > 100) {
					discount = 100;
				}
				
				totalPrice = totalPrice - discount;
				System.out.println("JUMBO APPLIED SUCCESSFULLY :)");
				System.out.println("DISCOUNTS: \u20b9"+discount);
				System.out.println("PLEASE PAY: \u20b9"+totalPrice);
				
			}else {
				System.out.println("Sorry, Invalid PromoCode :(");
				System.out.println("PLEASE PAY: \u20b9"+totalPrice);
			}
			
		} else if(totalPrice>=1000 && totalPrice<2000) {
			
			if(promoCode == ZOMATO) {
				
				double discount = 0.50 * totalPrice;
				
				if(discount > 200) {
					discount = 200;
				}
				
				totalPrice = totalPrice - discount;
				System.out.println("ZOMATO APPLIED SUCCESSFULLY :)");
				System.out.println("DISCOUNTS: \u20b9"+discount);
				System.out.println("PLEASE PAY: \u20b9"+totalPrice);
				
			}else {
				System.out.println("Sorry, Invalid PromoCode :(");
				System.out.println("PLEASE PAY: \u20b9"+totalPrice);
			}
			
		} else if(totalPrice>=2000) {
			
			if(promoCode == GOODFOODTRAIL) {
				
				double discount = 0.60 * totalPrice;
				
				if(discount > 300) {
					discount = 300;
				}
				
				totalPrice = totalPrice - discount;
				System.out.println("GOODFOODTRAIL APPLIED SUCCESSFULLY :)");
				System.out.println("DISCOUNTS: \u20b9"+discount);
				System.out.println("PLEASE PAY: \u20b9"+totalPrice);
				
			}else {
				System.out.println("Sorry, Invalid PromoCode :(");
				System.out.println("PLEASE PAY: \u20b9"+totalPrice);
			}
			
		}else {
			System.out.println("Sorry, No Discounts for You :( ");
		}
	}
	
	// Assignment: Suggest the Correct Promo Code to User
	//			   1. User can apply any promo code in any amount, but we must tell user whats the right promo code :)
	//			   2. Tell the user how mush user can save after applying the promo code :)
}

package co.edureka.exceptions;

import java.io.IOException;

// User-Defined UnChecked Exception by extending RuntimeException
// RuntimeException and all its children, built in or created by us will be UNCHECKED EXCEPTION
class UnCheckedBankingException extends RuntimeException{
	
	UnCheckedBankingException(String message){
		super(message);
	}
}

//User-Defined Checked Exception by extending Exception
class CheckedBankingException extends Exception{
	
	CheckedBankingException(String message){
		super(message);
	}
}

class BankAccount{
	
	int balance;
	int minBalance;
	String name;
	
	int attempts;
	
	BankAccount(String name) {
		
		this.name = name;
		balance = 10000;
		minBalance = 3000;
		attempts = 0;
		
		System.out.println("Bank Account Opened for "+name);
		System.out.println("Initial Balance: \u20b9"+balance);
		System.out.println();
	}
	
	void withdraw(int amount) throws IOException, CheckedBankingException{
		
		System.out.println("[Withdrawl for "+name+"]");
		
		balance -= amount;
		
		if(balance <= minBalance) {
			balance += amount;
			System.out.println("Withdraw of \u20b9"+amount+" FAILED: Balance is LOW: \u20b9"+balance+" against Min Balance of \u20b9"+minBalance);
			attempts++;
		}else {
			System.out.println("Withdraw of \u20b9"+amount+" SUCCESS: New Balance is: \u20b9"+balance);
		}
		
		System.out.println();
	
		if(attempts == 3) {
			// ArithmeticException is an UNCHECKED EXCEPTION
			//ArithmeticException aRef = new ArithmeticException("Illegal Transactions");
			//throw aRef;
			// throwing an UnChecked exception we didnt get error by Compiler
			
			//UnCheckedBankingException uRef = new UnCheckedBankingException("Illegal Transactions");
			//throw uRef;
			
			// IOException is a CHECKED EXCEPTION
			//IOException iRef = new IOException("Illegal Transactions");
			//throw iRef;
			
			// throwing a Checked exception we got error by Compiler
			
			CheckedBankingException cRef = new CheckedBankingException("Illegal Transactions");
			throw cRef;
		}
	}
	
}

public class ThrowThrowsApp {

	public static void main(String[] args) {
		
		System.out.println("Banking App Started");
		
		BankAccount account = new BankAccount("Fionna");
		
		try {
			for(int i=0;i<5000;i++) {
				account.withdraw(3000);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Banking App Finished");

	}

}

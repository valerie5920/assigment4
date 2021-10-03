package plswork;
import java.io.*;
import java.util.Scanner;
public class DepositWithdraw  {//start class
	public static void main(String[] args) throws IOException {//start main
		// TODO Auto-generated method stub
		
		SavingsAccount account1 = new SavingsAccount( 500.00, 20);
		
		File depositsFile = new File( "Deposits.txt" );
		File withdrawFile = new File("Withdraw.txt");
		Scanner inputFile = new Scanner(depositsFile);
		
		while(inputFile.hasNext() ) { // start while loop deposits
				account1.deposit (inputFile.nextDouble()   );
			}//end while
			inputFile.close();// file close deposits
		
		inputFile = new Scanner(withdrawFile);
		while(inputFile.hasNext() ) { // start while loop withdraw
			account1.withdraw (inputFile.nextDouble()   );
		}//end while
		inputFile.close();// file close with draw 
		double totalInterestEarned = (double) account1.addInterest();
		System.out.println("End balance:"+ account1.getBalance() + "Total Interest" + account1.getLastInterest());
	
		
		
		// C:\Users\Valerie\OneDrive\Documents\DepositsWithdraw\Deposit
		
		
	}//end main

}//end class
 
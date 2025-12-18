package assignment8;

import java.util.ArrayList;
import java.util.List;

public class Collections 
{

	public static void main(String[] args) 
	{
		short CreditTransactions = 0, DebitTransactions = 0;
		int CreditedAmount = 0, DebitedAmount = 0;
		short SuspiciousTransactions = 0;
		
		//Store all the transactions in any data structure of Your Choice from collections
		//List<Integer> Transactions = ArraysList(5000,-2000,3000,-15000,-200,-300,4000,3000);
		List<Integer> Transactions = new ArrayList<Integer>();
		
		Transactions.add(50000);
		Transactions.add(-2000);
		Transactions.add(3000);
		Transactions.add(-15000);
		Transactions.add(-200);
		Transactions.add(-300);
		Transactions.add(4000);
		Transactions.add(3000);
		
		for(int amount : Transactions)
		{
			if(amount > 0) 
			{
				CreditTransactions++;
				CreditedAmount += amount;
				
				//If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
				if(amount > 10000)
				{	
					System.out.println("Suspicious credit Transaction : " +amount);
					SuspiciousTransactions++;					
				}
			}
			else
			{
				DebitTransactions++;
				DebitedAmount += amount;
				
				//If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/debit Transaction Transaction with Amount”
				if(amount < -10000)
				{	
					System.out.println("Suspicious Debit Transaction : " +amount);
					SuspiciousTransactions++;
				}
			}
				
		}
		//print total number of suspicious transactions
		System.out.println("No. of Suspicious Transactions : " +SuspiciousTransactions);
		
		//Print total number of credit and debit transactions completed
		System.out.println("Total Credit Transactions = " +CreditTransactions);
		System.out.println("Total Debit Transactions = " +DebitTransactions);
		
		//Print the total amount credited and debited in account
		System.out.println("Total Credited Amount = " +CreditedAmount);
		System.out.println("Total Debited Amount = " +DebitedAmount);
		
		//Print total amount remaining at the end in Bank Account
		System.out.println("Total amount remaining = " +(CreditedAmount - DebitedAmount));
	}

}

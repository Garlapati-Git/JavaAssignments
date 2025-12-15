package Assignment7;

public class ConditionalStatements {

	public static void main(String[] args) 
	{
		/*System.main("CustomerName: ", args);
		System.main("CredirScore", args);
		System.main("income", args);
		System.main("isEmployed", args);
		System.main("debtToIncomeRation", args);*/
		
		String CustomerName = "John Doe";
		short CreditScore = 720;
		int income = 55000;
		boolean isEmployed = true;
		float debtToIncomeRation = 35.0f;
		
		if(CreditScore >= 750)
			System.out.println("Eligible for Loan; Loan Approved for "+CustomerName);
		else if(CreditScore > 650 && CreditScore < 750)
			if(income < 50000)
				System.out.println("Not Eligible for Loan; Loan Denied");
			else 
				if(isEmployed)
					if(debtToIncomeRation < 40)
						System.out.println("D2I Low; Loan Denied");
					else
						System.out.println("Eligible for Loan");
				else
					System.out.println("Not Employed; Loan Denied");
		else
			System.out.println("Credit Score Low; Loan Denied");

	}

}

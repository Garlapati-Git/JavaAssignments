package assignment11;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int n = 21, divisor = 0;
		
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
				divisor++;
		}
		
		if((divisor > 2) || (n < 2))
			System.out.println(n+ " is not Prime number");
		else
			System.out.println(n+ " is Prime number");
	}

}

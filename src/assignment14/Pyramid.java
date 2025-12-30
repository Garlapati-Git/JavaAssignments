package assignment14;

public class Pyramid 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
			for (int s = i; s < 5; s++) 
			{
                System.out.print(" ");
			}
			for(int n = 1; n <= i; n++)
			{
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		for(int i = 4; i > 0; i--)
		{
			for (int s = i; s < 5; s++) 
			{
                System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}

package assignment13;

public class power 
{

	public static void main(String[] args) 
	{
		float in = 2.00000F;
		int power = -2;
		double Answer = 1;
		
		if(power == 0)
			System.out.println("Any number power Zero is 1");
		else
		{	
			int i = Math.abs(power);
			while(i>0)
			{
				if(power < 0)
					Answer = Answer * 1/in;
				else
					Answer = Answer*in;
					
				i--;
			}
		}
		System.out.println(+in  +" power " + power +" is " +Answer);
	}
}
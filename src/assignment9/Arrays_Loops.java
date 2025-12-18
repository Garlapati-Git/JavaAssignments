package assignment9;

public class Arrays_Loops {

	public static void main(String[] args) 
	{
		short[] val = {12,34,11,36,87,98,93};
		short i = 0;
		short LN1 = 0, LN2 = 0, LN3 = 0;
		
			
		for(i=0;i<val.length;i++)
		{
			if(val[i] > LN1) 
			{
				LN3 = LN2;
				LN2 = LN1;
				LN1 = val[i];
			}
			else if(val[i] > LN2 && val[i] < LN1)
			{
				LN3 = LN2;
				LN2 = val[i];
			}
			else if(val[i] > LN3 && val[i] < LN2)
				LN3 = val[i];
		}
		System.out.println("2nd largest number = " + LN2);
		System.out.println("3rd largest number = " + LN3);

	}

}

package assignment6;

public class students 
{

	public static void main(String[] args) 
	{
		String [] names = {"Suresh","Mahesh","Naresh"};
		float [] marks1 = {75, 80, 82};
		float [] marks2 = new float[marks1.length];
		float average;
		
		for(int i = 0; i< marks1.length; i++)
		{
			marks2[i] = marks1[i];
			marks2[i] += 10;
		}
		
		average = (marks2[0]+marks2[1]+marks2[2])/3;
		System.out.println("Average marks of " +names[0] +", " +names[1] +", " +names[2] +" = " +average);
	}
}

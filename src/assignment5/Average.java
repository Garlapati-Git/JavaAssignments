package assignment5;

import java.util.ArrayList;
import java.util.Arrays;

public class Average
{
	public static void main(String[] args) 
	{
		// Create an array of 10 numbers 
		ArrayList<Integer> numbers = 
        		new ArrayList<>(Arrays.asList(34, 53, 75, 91, 82, 29, 46, 67, 18, 90));
		
		// Print out the Average of 5th and 6th Value
		System.out.println("5th Value: " + numbers.get(5-1));
        System.out.println("6th Value: " + numbers.get(6-1));
        System.out.println("Average: " + (numbers.get(5-1) + numbers.get(6-1))/2);
	}
}
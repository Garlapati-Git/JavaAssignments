package assignment5;

import java.util.TreeSet;

public class LargestCities 
{
	public static void main(String[] args) 
	{
		TreeSet<Double> Cities = new TreeSet<>();
		
		Cities.add(7000.0);
		Cities.add(2000.0);
		Cities.add(8000.0);
		Cities.add(9000.0);
		Cities.add(4000.0);
		
		double largest = Cities.last();
		double secondLargest = Cities.lower(largest);
		double thirdLargest = Cities.lower(secondLargest);
		
		System.out.println("Areas of Cities: " +Cities);
		
		// total area of the 3rd and 4th cities combined
		System.out.println("Total area of the 3rd and 4th cities combined = " +(thirdLargest+secondLargest));
	}
}
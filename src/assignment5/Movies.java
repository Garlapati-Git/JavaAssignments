package assignment5;

import java.util.ArrayList;
import java.util.List;

public class Movies 
{
	public static void main(String[] args) 
	{
		// List top 5 highest-grossing movies of all time
		List<String> Movies = new ArrayList<>();
		
		Movies.add("RRR");
		Movies.add("Kalki");
		Movies.add("Lokah");
		Movies.add("Bahubali");
		Movies.add("Yama Dhonga");

		// Print out the third movie on the list
		System.out.println("Third highest-grossing movie: " + Movies.get(3-1));
	}
}
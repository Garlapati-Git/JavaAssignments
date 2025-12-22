package assignment10;

import java.util.HashMap;
import java.util.Map;

public class Map_EmployeeHikes 
{
	public static void main(String[] args) 
	{
		Map<String, Double> Employees = new HashMap<>();
	
		// Employee data
		String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		double[] salary = {75000, 68000, 82000, 90000, 60000};
		double[] experience = {5.1, 3.2, 7.1, 10.2, 2.4};
		double[] rating = {4.2, 3.8, 4.5, 2.5, 3.5};
	
		for (int i = 0; i < names.length; i++) 
		{
			double variablePay;
			double bonus;
			double reward;
			double hike;
			double hikePercentage;
			
			// Rating logic
			if (rating[i] >= 4.0) 
			{
				variablePay = 0.15;
			    bonus = 1500;
			}
			else if (rating[i] >= 3.0)
			{
			    variablePay = 0.10;
			    bonus = 1200;
			}
			else 
			{
			    variablePay = 0.03;
			    bonus = 300;
			}
			
			// Experience reward
			if(experience[i] >= 5)
				reward = 5000;
			else
				reward = 0;
	
			// Hike calculation
			hike = (salary[i] * variablePay) + bonus + reward;
	
			// Hike percentage
			hikePercentage = hike / salary[i];
	
			// Store in map
			Employees.put(names[i], hikePercentage);
			
			System.out.println(names[i] + " : " + (Employees.get(names[i]) * 100) + "%");
		}
	}
}
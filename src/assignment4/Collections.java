package assignment4;

import java.util.HashMap;
import java.util.Map;

import Assignment3.Employees;

public class Collections 
{
	public static void main(String[] args) 
	{
		//Employees Obj = new Employees();
		
		// Outer Map: TestCase -> Row Data
        Map<String, Map<String, String>> EmployeeDetails = new HashMap<>();
        
        System.out.println("Employee E-Mail: "+ EmployeeDetails.get("EmployeeDetails").get("Email"));
	}
}

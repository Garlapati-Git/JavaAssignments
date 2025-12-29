package assignment4;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDetails 
{
	public static void main(String[] args) 
	{
		Map<String, Map<String, String>> Employee = new HashMap<>();
			
		Map<String, String> EMP1 = new HashMap<>();
		EMP1.put("EmployeeID", "E001");
		EMP1.put("Name", "Alice Green");
		EMP1.put("Age", "Thirty");
		EMP1.put("Gender", "Female");
		EMP1.put("Position", "Software Engineer");
		EMP1.put("Salary", "75000");
		EMP1.put("Email", "alice@example.com");
		EMP1.put("PAN_Number", "SDF6543210");
			
		Employee.put("Employee1", EMP1);
		
		
		Map<String, String> EMP2 = new HashMap<>();
		EMP2.put("EmployeeID", "E002");
		EMP2.put("Name", "Bob Johnson");
		EMP2.put("Age", "Thirty Five");
		EMP2.put("Gender", "Male");
		EMP2.put("Position", "Marketig Manager");
		EMP2.put("Salary", "850000");
		EMP2.put("Email", "bob@example.com");
		EMP2.put("PAN_Number", "REW6543211");	
		
		Employee.put("Employee2", EMP2);
		
		
		Map<String, String> EMP3 = new HashMap<>();
		EMP3.put("EmployeeID", "E003");
		EMP3.put("Name", "Carol White");
		EMP3.put("Age", "Twenty Eight");
		EMP3.put("Gender", "Female");
		EMP3.put("Position", "Sales Executive");
		EMP3.put("Salary", "65000");
		EMP3.put("Email", "carol@example.com");
		EMP3.put("PAN_Number", "TYR6543212");	
		
		Employee.put("Employee3", EMP3);
		
		
		System.out.println("Position of Employee3 : " + Employee.get("Employee3").get("Position"));
			
		/*	// Employee data
			String[] EmployeeID = {"E001", "E002", "E003"};
			String[] Name = {"Alice Green", "Bob Johnson", "Carol White"};
			String[] Age = {"Thirty", "Thirty Five", "Twenty Eight"};
			String[] Gender = {"Female", "Male", "Female"};
			String[] Position = {"Software Enineer", "Marketig Manager", "Sales Executive"};
			int[] Salary = {75000, 850000, 65000};
			String[] Email = {"alice@example.com", "bob@example.com", "carol@example.com"};
			String[] PAN_Number = {"SDF6543210", "REW6543211", "TYR6543212"};	*/
		}
}

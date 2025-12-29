package assignment4;

import java.util.HashMap;
import java.util.Map;

public class StudentDetails 
{
	public static void main(String[] args) 
	{
		Map<String, Map<String, String>> Students = new HashMap<>();
		
		Map<String, String> ST1 = new HashMap<>();
        ST1.put("Name", "John Doe");
        ST1.put("Age", "Twenty");
        ST1.put("Gender", "Male");
        ST1.put("Roll Number", "SBA12345");
        ST1.put("Grade", "A++");
        ST1.put("Major", "Computer Science");
        ST1.put("GPA", "A3.8");
        ST1.put("Email", "john@example.com");
        ST1.put("PAN Number", "SDF6543210");
        ST1.put("Address", "123 Elm St");
        
        Students.put("Student1", ST1);
        

        Map<String, String> ST2 = new HashMap<>();
        ST2.put("Name", "Jane Smith");
        ST2.put("Age", "Twenty One");
        ST2.put("Gender", "Female");
        ST2.put("Roll Number", "SBA12346");
        ST2.put("Grade", "B+");
        ST2.put("Major", "Mathematics");
        ST2.put("GPA", "A3.5");
        ST2.put("Email", "jane@example.com");
        ST2.put("PAN Number", "REW6543211");
        ST2.put("Address", "456 Oak St");

        Students.put("Student2", ST2);
        

        Map<String, String> ST3 = new HashMap<>();
        ST3.put("Name", "Mike Brown");
        ST3.put("Age", "Twenty Two");
        ST3.put("Gender", "Male");
        ST3.put("Roll Number", "SBA12347");
        ST3.put("Grade", "A+");
        ST3.put("Major", "Physics");
        ST3.put("GPA", "A3.9");
        ST3.put("Email", "mike@example.com");
        ST3.put("PAN Number", "TYR6543212");
        ST3.put("Address", "789 Pine St");

        Students.put("Student3", ST3);
        
        System.out.println("E-mail of Student 1: "+ Students.get("Student1").get("Email"));
		
/*      // Student data
		String[] Name = {"John Doe", "Jane Smith", "Mike Brown"};
		String[] Age = {"Twenty", "Twenty One", "Twenty Two"};
		String[] Gender = {"Male", "Female", "Male"};
		String[] RollNumber = {"SBA12345", "SBA12346", "SBA12347"};
		String[] Grade = {"A++", "B+", "A+"};
		String[] Major = {"Computer Science", "Mathematics", "Physics"};
		String[] GPA = {"A3.8", "A3.5", "A3.9"};
		String[] Email = {"john@example.com", "jane@example.com", "mike@example.com"};
		String[] PAN = {"SDF6543210", "REW6543211", "TYR6543212"};
		String[] Address = {"123 Elm St", "123 Elm St", "123 Elm St"};      */
	}
}

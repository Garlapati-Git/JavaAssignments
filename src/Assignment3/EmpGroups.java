package Assignment3;

class EmpGroups
{		
	public static void main(String[] args) 
	{	
		Employees Obj = new Employees();
		
		String [] EmpName = {Obj.EmployeeName1, Obj.EmployeeName2, Obj.EmployeeName3};
		int [] EmpID = {Obj.EmployeeID1, Obj.EmployeeID2, Obj.EmployeeID3};
		
		/*
		EmpName[0] = Obj.EmployeeName1;
		EmpName[1] = Obj.EmployeeName2;
		EmpName[2] = Obj.EmployeeName3;
		 
		EmpID[0] = Obj.EmployeeID1;
		EmpID[1] = Obj.EmployeeID2;
		EmpID[2] = Obj.EmployeeID3;
		*/
				
		System.out.println("Employee Name: " + EmpName[0] + ", Employee ID: " + EmpID[0]);
		System.out.println("Employee Name: " + EmpName[1] + ", Employee ID: " + EmpID[1]);
		System.out.println("Employee Name: " + EmpName[2] + ", Employee ID: " + EmpID[2]);
	}		
}

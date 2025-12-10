package Arrays;

public class Assignment2_Arrays 
{

	public static void main(String[] args) 
	{
		
			//Array 
			String [][][] Semester = {//{"Sem1","Sem2","Sem3","Sem4","Sem5"}
									{	
										{"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng."},
										{"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"}
									},
									{
										{"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engineering Graphics"},
										{"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"}
									},
									{
										{"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog."},
										{"Pass(88)","Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"}
									},
									{
										{"Algoriths","Computer Networks", "Database Systems","Microprocessors","Communication Eng.","Software Engineering"},
										{"Pass(91)","Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"}
									},
									{
										{"Probability and Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"},
										{"Pass(86)","Pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"}
									}
								};
	//Print Semester 2 Subject 4 and Subject 5 names.
	System.out.println("Semester 2 - Subject 4 is "+Semester[1][0][3]  +"\nSemester 2 - Subject 5 is "+Semester[1][0][4]);
	
	//Print the Status/Marks of Semester 4 Subject 3 and Subject 6
	System.out.println("Status/Marks of Semester 4 Subject 3: "+Semester[3][1][2] +"\nStatus/Marks of Semester 4 Subject 6: "+Semester[3][1][5]);
	}

}

//II. Write a program to find the grade of 2 students 
//based on total marks (3 subjects) 
//a) Get the student's marks by constructor.
// b) Return total mark to in main method 
//c) Find the grade of each student.
//java
import java.util.*;
public class GradeOfStudents
{
	static int total;
	int mark1,mark2,mark3;
	public GradeOfStudents(int mk1,int mk2,int mk3)
	{
		mark1=mk1;
		mark2=mk2;
		mark3=mk3;		
	}
	
	public int display()
	{
		total = mark1+mark2+mark3;
		return total;
	}
	public void grade()
	{
		int avg = (total/3);
		System.out.println("average "+avg);
		if(avg>90 && avg<=100)
			System.out.println("Grade A");
		else if(avg>80 && avg<=90)
			System.out.println("Grade B");
		else if(avg>70 && avg<=80)
			System.out.println("Grade C");
		else if(avg>60 && avg<=70)
			System.out.println("Grade D");
		else
			System.out.println("Failed");	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student 1 marks");
		System.out.println("enter sub1 mark between 0-100: ");
		int res1 = sc.nextInt();
		System.out.println("enter sub2 mark between 0-100: ");
		int res2 = sc.nextInt();
		System.out.println("enter sub3 mark between 0-100: ");
		int res3 = sc.nextInt();
		GradeOfStudents obj1= new GradeOfStudents(res1,res2,res3);
		
		System.out.println("enter student 2 marks");
		System.out.println("enter sub1 mark between 0-100: ");
		int rest1 = sc.nextInt();
		System.out.println("enter sub2 mark between 0-100: ");
		int rest2 = sc.nextInt();
		System.out.println("enter sub3 mark between 0-100: ");
		int rest3 = sc.nextInt();
		GradeOfStudents obj2= new GradeOfStudents(rest1,rest2,rest3);
		
		int finalResult = obj1.display();
		System.out.println("student1 total marks: "+finalResult);
		obj1.grade();
		
		int finalResult2 = obj2.display();
		System.out.println("student2 total marks: "+finalResult2);
		obj2.grade();
	}	
}
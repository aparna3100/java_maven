// java pgm
// student grade calculation using coditions
import java.util.*;
public class StudentGrade
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int marks;
		System.out.println("enter marks obtained : ");
		marks = sc.nextInt();
		int total = 100;
		if(marks <= total)
		{
			if(marks < 40)
			{
				System.out.println("Failed");
			}
			else if(marks >= 40 && marks <=60)
			{
				System.out.println("Grade D");
			}
			else if(marks >= 61 && marks <=70)
			{
				System.out.println("Grade C");
			}
			else if(marks >= 71 && marks <=80)
			{
				System.out.println("Grade B");
			}
			else
			{
				System.out.println("Grade A");
			}
			
		}
		else{
			System.out.println("invalid");
		}
}}
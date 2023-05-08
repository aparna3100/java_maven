//II. Write a program to find the factorial of a number (static method).
// Output – “Factorial of <given number> is <result>. 
//java
import java.util.*;
public class Factorial
{
	static int ft;
	static int number;
	public static void fact(int n)
	{
		number = n;
		int i,f=1;
		ft=f;
		for(i=1;i<=n;i++)
		{
			ft=ft*i;
		}	
	}	
	public static void display()
	{
		System.out.println("Factorial of "+number+"is "+ft);
	}
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);  
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		Factorial.fact(num);
		Factorial.display();
	}
}

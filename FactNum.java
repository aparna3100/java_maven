// II. Program to find the factorial of a number.
// a) Two methods, one for find calculate and other for print result.
// b) Pass the number as argument
// c) Main method allows to invoke only one method.
//java
import java.util.*;
public class FactNum
{
	static int number,fact=1;
	public FactNum(int n)
	{
		number = n;
	}
	public void factorial()
	{
		for(int i=1;i<=number;i++)
		{
			 fact=fact*i;
		}
		display();
	}
	public void display()
	{
		System.out.println("factorial is : "+fact );
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		FactNum obj = new FactNum(num);
		obj.factorial();
		
	}
}
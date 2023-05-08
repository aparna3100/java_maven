//java program to check whether a number is positive or negative 
// nested if 
import java.util.*;
public class IfPositive
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int number;
System.out.println("enter number: ");
number = sc.nextInt();
if(number>=0)
{
	if(number==0)
	{
	System.out.println("the number is zero");
	}

	else
	{
	
		System.out.println("the number is positive");
	
	}
}
else
{
	System.out.println("the number is negative");
}


}
}
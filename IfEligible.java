// java program to check whether The candidate is eligible for driving license or not
import java.util.*;
public class IfEligible
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int age;
System.out.println("enter age: ");
age = sc.nextInt();
if(age>=18)
{
	System.out.println("The candidate is eligible for driving license.");
}
else
{
	System.out.println("The candidate is not eligible for driving license.");
}
}
}
// java program to check whether a number is odd or even
//if else
import java.util.*;
public class IfOdd
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int number;
System.out.println("enter number: ");
number = sc.nextInt();
if(number % 2 == 0)
{
	System.out.println("The number is even");
}
else
{
	System.out.println("The number is odd");
}
}
}
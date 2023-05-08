// java if , else if , else statements and java conditions
//import statement 
//scanner  input method
import java.util.*;
public class ElseIf
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  int number;
  System.out.println("enter number: ");
  number = sc.nextInt();
  if(number>0)
  {
	System.out.println("the number is positive");  
	if(number>=10)
	{
		System.out.println("number greater than or equal to 10");
	}
	else 
	{
		System.out.println("number less than 10");
	}
	
  }
  else if(number<0)
  {
	System.out.println("the number is negative");
  }
  else
  {
    System.out.println("the number is zero");
  }

}
}
//III. Write a program to check whether the given number is Palindrome/Not 
//by using static methods. 
//a) Method 1- to find the reverse (pass the number in argument)
// b) Method 2-to check palindrome/not.
//java
import java.util.*;
public class PalindromeOrNot
{
	static int temp;
	static int sum;
	public static void reverse(int n)
	{
		int rem;
		temp=n;  
		int s=0;
		sum=s;
		while(n>0)
		{    
			rem=n%10;  
			sum=(sum*10)+rem;    
			n=n/10;    
		}
	}
	public static void palinindrome()
	{
		if(temp==sum) 
		{   
			System.out.println("palindrome number ");    
		}
		else 
		{			
			System.out.println("not palindrome");    
		}
	}
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);  
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		PalindromeOrNot.reverse(num);
		PalindromeOrNot.palinindrome();
	}
}
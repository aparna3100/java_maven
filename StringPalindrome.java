// java Program to check whether the given Strings are Palindrome or not.
// a) Java b) Malayalam
import java.util.*;
public class StringPalindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice 1 if string is in lowercase and choice 2 if string is in Uppercase: ");
		int choice=sc.nextInt();
		System.out.println("enter the string :");
		sc.nextLine();
		String str1=sc.nextLine();
		String reverseStr = new String("");
		int strLength = str1.length();
		for (int i = (strLength - 1); i >=0; --i) 
		{
			reverseStr = reverseStr + str1.charAt(i);
		}
		System.out.println("reverse of given string is: "+reverseStr);
		switch(choice)
		{
			case 1:
				if(str1.toUpperCase().equals(reverseStr.toUpperCase()))
					System.out.println(str1 + " is a Palindrome String.");
				else 
					System.out.println(str1 + " is not a Palindrome String.");
				break;
			case 2:
				if(str1.toLowerCase().equals(reverseStr.toLowerCase()))
					System.out.println(str1 + " is a Palindrome String.");
				else 
					System.out.println(str1 + " is not a Palindrome String.");
				break;
			default:
				System.out.println("invalid");
		
    }
	}
}

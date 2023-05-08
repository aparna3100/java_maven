import java.util.*;
public class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("enter a character: ");
		ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'a':
			    System.out.println("vowel");
				break;
			case 'e':
			    System.out.println("vowel");
				break;
			case 'i':
			    System.out.println("vowel");
				break;
			case 'o':
			    System.out.println("vowel");
				break;
			case 'u':
			    System.out.println("vowel");
				break;	
			
			default:
				System.out.println("not a vowel");
		}
	}
}	
							
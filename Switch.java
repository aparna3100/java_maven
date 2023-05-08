//java pgm
//switch case
import java.util.*;
public class Switch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("enter number between 0 and 3: ");
		number = sc.nextInt();
		switch(number)
		{
			case 0:
			    number++;
			    System.out.println("number is: "+number);
				break;
			case 1:
			    number--;
			    System.out.println("number is: "+number);
				break;
			case 2:
			    number+=10;
			    System.out.println("number is: "+number);
				break;
			case 3:
			    number-=10;
			    System.out.println("number is: "+number);
				break;
			default:
			    System.out.println("invalid");
		}
	}
}
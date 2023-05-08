//java
import java.util.*;
public class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,number,rem;
		int total=0;
		System.out.println("enter the number: ");
		num = sc.nextInt();
		number = num;
		while(number!=0)
		{
			rem = number % 10;
            total = total + rem*rem*rem;
            number = number / 10;
		}
		if(total == num)
            System.out.println( "an Armstrong number");
        else
            System.out.println(" not an Armstrong number");
    }
}
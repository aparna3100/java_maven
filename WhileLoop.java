//while loop java
import java.util.*;
public class WhileLoop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i=1,n;
		System.out.println("enter the limit: ");
		n = sc.nextInt();
		/*
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		*/
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		
}
}
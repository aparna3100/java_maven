//do while loop java
import java.util.*;
public class DoWhileLoop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i=1,n;
		System.out.println("enter the limit: ");
		n = sc.nextInt();
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=n);
}
}
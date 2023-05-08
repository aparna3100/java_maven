import java.util.*;
public class ForLoop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.println("enter the limit: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
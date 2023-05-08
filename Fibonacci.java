//java
import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i,n;
		int t1=0,t2=1,nt;
		System.out.println("enter the limit: ");
		n = sc.nextInt();
		
		for(i=0;i<=n;i++)
		{
			System.out.println(t1);
			nt= t1 + t2;
			t1 = t2;
			t2 = nt;
			
		}
	}
}
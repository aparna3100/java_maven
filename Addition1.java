//java addition using instance method,constructor
import java.util.*;
public class Addition1
{	int num1,num2;
	public Addition1(int a1,int a2)
	{
		num1=a1;
		num2=a2;
		
	}
	public int display()
	{
		int sum = num1+ num2;
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1: ");
		int result1 = sc.nextInt();
		System.out.println("enter num2: ");
		int result2 = sc.nextInt();
		
		Addition1 obj1=new Addition1(result1,result2);
		
		int finalresult = obj1.display();
		System.out.println("sum is: "+finalresult);
		
	}
}
	
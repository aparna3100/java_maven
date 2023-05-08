// java static addition ex
public class StaticAddition
{
	public static float addition(int num1 ,float num2)
	{
		float sum;
		sum =num1 + num2;
		return sum;
		
	}
	public static void average()
	{
		float result = addition(20,30.5f);
		System.out.println("sum: "+result);
		float avg=result/2;
		System.out.println("average: "+avg);
		
	}
	public static void main(String[] args)
	{
		StaticAddition.average();
		
	}
}
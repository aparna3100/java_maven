public class Example
{
	static int a;
	public void method1(int num)
	{
		a = num;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Example obj = new Example();
		obj.method1(20);
	}
}
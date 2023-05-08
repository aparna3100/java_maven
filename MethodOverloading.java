//java methodoverloading
//polymorphism - compile time
public class MethodOverloading
{
	public static void operation(int a1,int a2)
	{
		int res = a1 + a2;
		System.out.println("sum: "+res);
	}
	public static void operation(float a1,int a2)
	{
		float res = a1 - a2;
		System.out.println("diff: "+res);
	}
	public static void operation(int a1,int a2,int a3)
	{
		int res = a1 * a2 * a3;
		System.out.println("mul: "+res);
	}
	public static void operation(int a1,float a2)
	{
		float res = a2 / a1;
		System.out.println("div: "+res);
	}
	public static void main(String[] args)
	{
		MethodOverloading.operation(22,34);
		MethodOverloading.operation(25f,12);
		MethodOverloading.operation(33,44,65);
		MethodOverloading.operation(45,65f);
		
	}
}                             
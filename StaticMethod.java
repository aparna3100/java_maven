// java static method example
public class StaticMethod
{
	static int number1;
	public static void operation(int num)
	{
		number1 = num;
		number1+=35;
	}
	public static void display()
	{
		System.out.println("number 1: "+number1);
	}
	public static void main(String[] args)
	{
		System.out.println("Static method example");
		StaticMethod.operation(25);
		StaticMethod.display();
	}
}
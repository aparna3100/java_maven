public class Example2
{
	static String name;
	public static String display(String nam)
	{
		name=nam;
		return name;
	}
	public static void main(String[] args)
	{
		
		String newN = display("Aparna");
		System.out.println("name: "+newN);
	}
}
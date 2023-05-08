//II. Write a program to find the Area of figures 
//(circle, rectangle, square) 
//by using three methods 
//(should have same method name)
//java
public class AreaOverloading
{
	public static void area(double r)
	{
		double a = 3.14 * r * r;
		System.out.println("area of circle is "+a);
	}
	public static void area(float w,float l)
	{
		float a = w * l;
		System.out.println("area of rectangle is "+a);	
	}
	public static void area(int s)
	{
		int a = s * s;
		System.out.println("area of square is "+a);	
	}
	public static void main(String[] args)
	{
		AreaOverloading.area(6f);
		AreaOverloading.area(10f,22f);
		AreaOverloading.area(5);
	}
	
	
}
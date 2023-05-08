//I. Write a program to find the Area of figures.
// a) Circle (pi*r*r)
// b) Rectangle(l*b) 
//c) Square(a*a)
// (Prompt the user to select the options(a/b/c) from command prompt.
// Get the inputs that needs to find area.)
//java
import java.util.*;
public class Area
{
	public float circle(float r)
	{
		float area = 3.14f * r *r;
		return area;
	}
	public float rectangle(float l,float b)
	{
		float area = l*b;
		return area;
	}
	public float square(float a)
	{
		float  area = a*a;
		return area;
	}
		
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("which area is to be calculated?");
        System.out.println("1. circle");
        System.out.println("2. rectangle");
        System.out.println("3. square");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("enter the radius");
				float radius = sc.nextFloat();
				Area obj = new Area();
				float result=obj.circle(radius);
				System.out.println("area is:"+result);
				break;
			case 2:
				System.out.println("enter the length and breadth");
				float length = sc.nextFloat();
				float breadth = sc.nextFloat();
				Area obj2 = new Area();
				float result2=obj2.rectangle(length,breadth);
				System.out.println("area is:"+result2);
				break;
			case 3:
				System.out.println("enter the side");
				float  side = sc.nextFloat();
				Area obj3 = new Area();
				float result3=obj3.square(side);
				System.out.println("area is:"+result3);
				break;
			default:
				System.out.println("Invalid choice");	
		}
	}
}
//I. Write a program to set your name and age by a static method 
//and get them in another static method.
//java
import java.util.*;
public class NameAge
{
	static String name;
	static int age;
	public static void myname(String n)
	{
		name = n;
	}
	public static void myage(int a)
	{
		age = a;
	}
	
	public static void display()
	{
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);  
		System.out.println("enter the name");
		String str = sc.nextLine();
		System.out.println("enter the age");
		int num = sc.nextInt();
		System.out.println("-----Name and age----- ");
		NameAge.myname(str);
		NameAge.myage(num);
		NameAge.display();

	}
}
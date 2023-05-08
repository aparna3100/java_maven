//this example
//java
public class Student
{
	int rollNo;
	String name;
	public Student(int num1,String n)
	{
		this(100);
		rollNo=num1;
		name=n;
		
	}
	public Student()
	{
		this(1000,"arya");
		System.out.println("no argument constructor");
	}
	public Student(int num2)
	{
		rollNo=num2;
		System.out.println("parameterized constructor");
	}
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("roll no: "+rollNo);

	}
	public static void main(String[] args)
	{
		Student obj = new Student();
		obj.display();
	}
}
//java instance method ex
//java constructor
public class Employee
{
	String empName;
	int empId;
	static String companyName="obsqura";
	
	public Employee(String name,int id)
	{
		empName = name;
		empId = id;
		System.out.println("parameterized constructor");
	}
	public void display()
	{
		System.out.println("employee name : " +empName);
		System.out.println("employee id : " +empId);
		System.out.println("company name : " +companyName);
	}
	public static void main(String[] args)
	{
		Employee obj1 = new Employee("abcd",100);
		Employee obj2 = new Employee("pqrs",101);
		

		
		
		System.out.println("----employee1----");
		obj1.display();
		
		System.out.println("----employee2----");
		obj2.display();
	}
}
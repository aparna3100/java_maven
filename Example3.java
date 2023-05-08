public class Example3
{
	static String colgName="st.thomas";
	int rollNo;
	String studName;
	public Example3(String studName,int rollNo)
	{
		this.studName=studName;
		this.rollNo=rollNo;
		
	}
	public void display()
	{
		System.out.println("College name : "+colgName);
		System.out.println("student name : "+studName);
		System.out.println("roll number : "+rollNo);
	}
	public static void main(String[] args)
	{
		Example3 obj = new Example3("Aparna",25);
		
		obj.display();
	}
	
}
//I. Write a program to find the Average of three integer numbers, 
//three float numbers 
//(should have same method name)
//java
public class AverageOverloading
{
	public static void average(int num1,int num2,int num3)
	{
		int avg = (num1+num2+num3)/3;
		System.out.println("average of 3 integer numbers: "+avg);
	}
	public static void average(float num1,float num2,float num3)
	{
		float avg = (num1+num2+num3)/3;
		System.out.println("average of 3 float numbers: "+avg);
	}
	public static void main(String[] args)
	{
		AverageOverloading.average(25,35,45);
		AverageOverloading.average(35f,45f,75f);
	}
}
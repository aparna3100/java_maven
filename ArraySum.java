//java
//II. Write a program to sum up all the elements of an array.
import java.util.*;
public class ArraySum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		int i,sum=0;
		System.out.println("enter the array elements: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("-----ARRAY-----");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nsum of all the elements of array: ");
		for(i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		System.out.println(sum);	
	}
}
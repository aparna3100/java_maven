// III. Write a program to search array element with Linear Search.
//java
import java.util.*;
public class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		int i,element=0,index=-1;
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
		System.out.println("\nenter the array element to search");
		element = sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i] == element)
			{
				index=i+1;
				break;
			}
			
		}
		if(index == -1)
		{
			System.out.println(element + " isn't present in array.");  
		}
		System.out.println("element is present at position  : "+index);
}
}
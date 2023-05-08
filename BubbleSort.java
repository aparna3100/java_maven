// bubble sort using array in java 
import java.util.*;
public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		int i,temp=0;
		System.out.println("enter the array elements: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("-----ARRAY BEFORE BUBBLE SORT-----");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(i=0; i < arr.length; i++)
		{
			for(int j=1; j < (arr.length-i); j++)
			{
				if(arr[j-1] > arr[j])
				{
					temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
                          
            }  
        }
		System.out.println("-----ARRAY AFTER BUBBLE SORT-----");  
        for(i=0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");  
        }  
	}
}
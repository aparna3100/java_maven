//I. Write a java  program to find the count of even numbers and odd numbers from 10 to 20. 
public class CountEvenOdd
{
	public static void main(String[] args)
	{
		int[] arr = {10,11,12,13,14,15,16,17,18,19,20};
		int i,evenCount=0,oddCount=0;
		for(i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println("\neven numbers in array: ");
		for(i = 0;i < arr.length;i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] +" ");
				evenCount++;
			}
			
		}
		System.out.println("\ncount of even numbers:"+evenCount);
		System.out.println("\nodd numbers in array: ");
		for(i = 0;i < arr.length;i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.print(arr[i] +" ");
				oddCount++;
			}
			
		}
		System.out.println("\ncount of odd numbers: "+oddCount);
	}
}
//java array declaration
import java.util.*;
public class Array
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int[] arr=new int[size];
		int i;
		System.out.println("enter the array elements");
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("-----ARRAY-----");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

//int[] arr=new int[5];
/* int[] arr;
arr = new int[5];
*/
//int[] arr ={10,20,30,40};
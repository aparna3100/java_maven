// matrix java 
import java.util.*;
public class Matrix
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("enter the number of column: ");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("enter the matrix elements: ");
		for (int i = 0;i < 3;i++)
		{
			for(int j = 0;j < 4;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0;i < 3;i++)
		{
			for(int j = 0;j < 4;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
//java pgm to add matrices
import java.util.*;
public class AddMatrices
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("enter the number of column: ");
		int col = sc.nextInt();
		
		int i,j;
		
		int[][] mat1 = new int[row][col];
		int[][] mat2 = new int[row][col];
		int[][] sum = new int[row][col];
		
		System.out.println("enter matrix1 elements: ");
		for (i = 0;i < row;i++)
		{
			for(j = 0;j < col;j++)
			{
				mat1[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("enter matrix2 elements: ");
		for (i = 0;i < row;i++)
		{
			for(j = 0;j < col;j++)
			{
				mat2[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("-----matrix1 elements----- ");
		for (i = 0;i < row;i++)
		{
			for(j = 0;j < col;j++)
			{
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----matrix2 elements----- ");
		for (i = 0;i < row;i++)
		{
			for(j = 0;j < col;j++)
			{
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//-----Addition----- 
		for (i = 0;i < row;i++)
		{
			for(j = 0;j < col;j++)
			{
				sum[i][j]=mat1[i][j] + mat2[i][j] ;
			}
			System.out.println();
		}
		
		System.out.println("-----SUM----- ");
		for (i = 0;i < row;i++)
		{
			for(j = 0;j < col;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
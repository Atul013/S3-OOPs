//Program to multiply two matrices
import java.util.*;
class product
{
	public static void main (String args[])
	{
		int a[][] = new int [50][50];
		int b[][] = new int [50][50];
		int sum [][] = new int [50][50];
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number of Rows of first matrix: ");
		int r1 = s.nextInt();
		System.out.print("Enter the number of Columns of first matrix: ");
		int c1 = s.nextInt();
		System.out.print("Enter the number of Rows of second matrix: ");
		int r1 = s.nextInt();
		System.out.print("Enter the number of Columns of second matrix: ");
		int c1 = s.nextInt();
		if (c1 != r2)
		{
			break;
		}
		
		System.out.println("Enter the elements of the first matrix :");
		for (int i =0; i<r1; i++)
		{
			for (int j =0; j<c; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the elements of the second array :");
		for (int i =0; i<r; i++)
		{
			for (int j =0; j<c; j++)
			{
				b[i][j] = s.nextInt();
			}
		}
		System.out.println("Product of the two arrays is :");
		for (int i =0; i<r; i++)
		{
			for (int j =0; j<c; j++)
			{
				sum[i][j] = a[i][j] b[i][j];
				System.out.print(a[i][j]);
			}
			System.out.println("\n");
		}
	}
}
		

//Program to add two matrices
import java.util.*;
class matrixadd
{
	public static void main (String args[])
	{
		int a[][] = new int [50][50];
		int b[][] = new int [50][50];
		int sum [][] = new int [50][50];
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number of Rows: ");
		int r = s.nextInt();
		System.out.print("Enter the number of Columns: ");
		int c = s.nextInt();
		System.out.println("Enter the elements of the first array :");
		for (int i =0; i<r; i++)
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
		System.out.println("Sum of the two arrays is :");
		for (int i =0; i<r; i++)
		{
			for (int j =0; j<c; j++)
			{
				sum[i][j] = a[i][j]+ b[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println("\n");
		}
		s.close();
	}
}
		

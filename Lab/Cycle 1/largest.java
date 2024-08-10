//Program to find the largest of N numbers without using arrays
import java.util.*;
class largest 
{	public static void main (String args[])
	{	int n, num;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		n = s.nextInt();
		int largest = 0;
		System.out.println("Enter the " +n+ " numbers :");
		for (int i = 0; i < n; i++)
		{	num = s.nextInt();
			if(num > largest)
			{	largest = num;
			}
		}
		System.out.println("The largest number is: " +largest);
		s.close();
	}
}
 

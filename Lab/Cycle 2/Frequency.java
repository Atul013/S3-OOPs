import java.util.*;
class Frequency
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=s.nextLine();
		System.out.print("Enter the character : ");
		char chr=s.next().charAt(0);
		int n= str.length();
		int c=0;
		for(int i=0;i<n;i++)
		{
			char m=str.charAt(i);
			if (m==chr)
				c++;
		}
		System.out.println("the number of "+ "'" +chr +"'"+" in "+str+ " is " +c);
        s.close();
	}
}
			
			
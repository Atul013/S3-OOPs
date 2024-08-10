import java.util.*;
class strrev
{
	public static void main(String args[])
	{
	
		Scanner s=new Scanner(System.in);
		String str,rev="";
		System.out.print("Enter a string : ");
		str=s.nextLine();
		for(int i=(str.length()-1); i>-1; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("The Reverse of the "+str+" is "+rev);
		s.close();
	}
}
		
			
import java.util.*;
public class PalindromeChecker 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String rev= "", str = s.nextLine();
        int len = str.length();
        for (int i =len-1; i >=0; i--)
        {
            rev += str.charAt(i);
        }
        if (str.equals((rev)))
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }
        s.close();
    }
}
